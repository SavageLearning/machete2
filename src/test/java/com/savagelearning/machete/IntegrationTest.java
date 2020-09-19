package com.savagelearning.machete;

import com.savagelearning.machete.api.Saying;
import com.savagelearning.machete.core.Person;
import io.dropwizard.testing.ConfigOverride;
import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit5.DropwizardAppExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import org.eclipse.jetty.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(DropwizardExtensionsSupport.class)
public class IntegrationTest {

    private static final String TMP_FILE = createTempFile();
    private static final String CONFIG_PATH = ResourceHelpers.resourceFilePath("test-example.yml");
    private static final String MIGRATE_PATH = ResourceHelpers.resourceFilePath("migrations.yml");

    public static final DropwizardAppExtension<EmployerConfiguration> RULE = new DropwizardAppExtension<>(
            EmployerApplication.class, CONFIG_PATH,
            ConfigOverride.config("database.url", "jdbc:h2:" + TMP_FILE));

    @BeforeAll
    public static void migrateDb() throws Exception {
        RULE.getApplication().run("db", "migrate", CONFIG_PATH, "--migrations", MIGRATE_PATH);
    }

    private static String createTempFile() {
        try {
            return File.createTempFile("test-example", null).getAbsolutePath();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Test
    public void testEmployer() throws Exception {
        final Optional<String> name = Optional.of("Dr. IntegrationTest");
        final Saying saying = RULE.client().target("http://localhost:" + RULE.getLocalPort() + "/employer")
                .queryParam("name", name.get())
                .request()
                .get(Saying.class);
        assertThat(saying.getContent()).isEqualTo(RULE.getConfiguration().buildTemplate().render(name));
    }

    // @Test
    // public void testSwagger() throws Exception {
    //     final Optional<String> name = Optional.of("Dr. IntegrationTest");
    //     final Saying result = RULE.client().target("http://localhost:" + RULE.getLocalPort() + "/openapi.json")
    //             .request()
    //             .get()
    //             .readEntity(String.class);
    //     assertThat(result).contains("Hello World API");
    // }

    @Test
    public void testPostPerson() throws Exception {
        final Person person = new Person("Dr. IntegrationTest", "Chief Wizard", 1525);
        final Person newPerson = postPerson(person);
        assertThat(newPerson.getId()).isNotNull();
        assertThat(newPerson.getFullName()).isEqualTo(person.getFullName());
        assertThat(newPerson.getJobTitle()).isEqualTo(person.getJobTitle());
    }

    @Test
    public void testRenderingPersonFreemarker() throws Exception {
        testRenderingPerson("view_freemarker");
    }

    @Test
    public void testRenderingPersonMustache() throws Exception {
        testRenderingPerson("view_mustache");
    }

    private void testRenderingPerson(String viewName) throws Exception {
        final Person person = new Person("Dr. IntegrationTest", "Chief Wizard", 1525);
        final Person newPerson = postPerson(person);
        final String url = "http://localhost:" + RULE.getLocalPort() + "/people/" + newPerson.getId() + "/" + viewName;
        Response response = RULE.client().target(url).request().get();
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK_200);
    }

    private Person postPerson(Person person) {
        return RULE.client().target("http://localhost:" + RULE.getLocalPort() + "/people")
                .request()
                .post(Entity.entity(person, MediaType.APPLICATION_JSON_TYPE))
                .readEntity(Person.class);
    }

    @Test
    public void testLogFileWritten() throws IOException {
        // The log file is using a size and time based policy, which used to silently
        // fail (and not write to a log file). This test ensures not only that the
        // log file exists, but also contains the log line that jetty prints on startup
        final Path log = Paths.get("./logs/application.log");
        assertThat(log).exists();
        final String actual = new String(Files.readAllBytes(log), UTF_8);
        assertThat(actual).contains("0.0.0.0:" + RULE.getLocalPort());
    }
}
