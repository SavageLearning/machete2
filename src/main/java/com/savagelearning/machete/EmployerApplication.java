package com.savagelearning.machete;

import com.savagelearning.machete.auth.EmployerAuthenticator;
import com.savagelearning.machete.auth.EmployerAuthorizer;
import com.savagelearning.machete.cli.RenderCommand;
import com.savagelearning.machete.core.Person;
import com.savagelearning.machete.core.Template;
import com.savagelearning.machete.core.User;
import com.savagelearning.machete.db.PersonDAO;
import com.savagelearning.machete.filter.DateRequiredFeature;
import com.savagelearning.machete.health.TemplateHealthCheck;
import com.savagelearning.machete.resources.FilteredResource;
import com.savagelearning.machete.resources.EmployerResource;
import com.savagelearning.machete.resources.PeopleResource;
import com.savagelearning.machete.resources.PersonResource;
import com.savagelearning.machete.resources.ProtectedResource;
import com.savagelearning.machete.resources.ViewResource;
import com.savagelearning.machete.tasks.EchoTask;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.auth.AuthDynamicFeature;
import io.dropwizard.auth.AuthValueFactoryProvider;
import io.dropwizard.auth.basic.BasicCredentialAuthFilter;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployerApplication extends Application<EmployerConfiguration> {
    public static void main(String[] args) throws Exception {
        new EmployerApplication().run(args);
    }

    private final HibernateBundle<EmployerConfiguration> hibernateBundle =
        new HibernateBundle<EmployerConfiguration>(Person.class) {
            @Override
            public DataSourceFactory getDataSourceFactory(EmployerConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        };

    @Override
    public String getName() {
        return "employer";
    }

    @Override
    public void initialize(Bootstrap<EmployerConfiguration> bootstrap) {
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(
                        bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );

        bootstrap.addCommand(new RenderCommand());
        bootstrap.addBundle(new AssetsBundle());
        bootstrap.addBundle(new MigrationsBundle<EmployerConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(EmployerConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        });
        bootstrap.addBundle(hibernateBundle);
        bootstrap.addBundle(new ViewBundle<EmployerConfiguration>() {
            @Override
            public Map<String, Map<String, String>> getViewConfiguration(EmployerConfiguration configuration) {
                return configuration.getViewRendererConfiguration();
            }
        });
        bootstrap.addBundle(new AssetsBundle("/app", "/app", "index.html", "static"));
    }

    @Override
    public void run(EmployerConfiguration configuration, Environment environment) {
        final PersonDAO dao = new PersonDAO(hibernateBundle.getSessionFactory());
        final Template template = configuration.buildTemplate();

        environment.healthChecks().register("template", new TemplateHealthCheck(template));
        environment.admin().addTask(new EchoTask());
        environment.jersey().register(DateRequiredFeature.class);
        environment.jersey().register(new AuthDynamicFeature(new BasicCredentialAuthFilter.Builder<User>()
                .setAuthenticator(new EmployerAuthenticator())
                .setAuthorizer(new EmployerAuthorizer())
                .setRealm("SUPER SECRET STUFF")
                .buildAuthFilter()));
        environment.jersey().register(new AuthValueFactoryProvider.Binder<>(User.class));
        environment.jersey().register(RolesAllowedDynamicFeature.class);
        environment.jersey().register(new EmployerResource(template));
        environment.jersey().register(new ViewResource());
        environment.jersey().register(new ProtectedResource());
        environment.jersey().register(new PeopleResource(dao));
        environment.jersey().register(new PersonResource(dao));
        environment.jersey().register(new FilteredResource());
        OpenAPI oas = new OpenAPI();
        Info info = new Info()
                .title("Machete API")
                .description("RESTful greetings for you.")
                .termsOfService("http://example.com/terms")
                .contact(new Contact().email("john@example.com"));
     
        oas.info(info);

        List<Server> servers = new ArrayList<>();
        servers.add(new Server().url("/api"));
        oas.servers(servers);
        SwaggerConfiguration oasConfig = new SwaggerConfiguration()
                .openAPI(oas)
                .prettyPrint(true)
                .resourcePackages(Stream.of("com.savagelearning.machete")
                                  .collect(Collectors.toSet()));
        environment.jersey().register(new OpenApiResource()
                .openApiConfiguration(oasConfig));
    }
}
