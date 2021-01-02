package com.savagelearning.machete;

import com.savagelearning.machete.auth.MacheteAuthenticator;
import com.savagelearning.machete.auth.MacheteAuthorizer;
import com.savagelearning.machete.cli.RenderCommand;
import com.savagelearning.machete.core.Person;
import com.savagelearning.machete.core.Template;
import com.savagelearning.machete.core.User;
import com.savagelearning.machete.db.PersonDAO;
import com.savagelearning.machete.filter.DateRequiredFeature;
import com.savagelearning.machete.health.TemplateHealthCheck;
// import com.savagelearning.machete.resources.EmployersResource;
import com.savagelearning.machete.resources.FilteredResource;
import com.savagelearning.machete.resources.MacheteResource;
import com.savagelearning.machete.resources.PeopleResource;
import com.savagelearning.machete.resources.PersonResource;
import com.savagelearning.machete.resources.ProtectedResource;
import com.savagelearning.machete.resources.ViewResource;
import com.savagelearning.machete.tasks.EchoTask;
import com.bendb.dropwizard.jooq.JooqBundle;
import com.bendb.dropwizard.jooq.JooqFactory;
import com.savagelearning.jooq.tables.daos.EmployersDao;
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

public class MacheteApplication extends Application<MacheteConfiguration> {
    public static void main(String[] args) throws Exception {
        new MacheteApplication().run(args);
    }

    private final HibernateBundle<MacheteConfiguration> hibernateBundle =
        new HibernateBundle<MacheteConfiguration>(Person.class) {
            @Override
            public DataSourceFactory getDataSourceFactory(MacheteConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        };

    @Override
    public String getName() {
        return "machete";
    }

    @Override
    public void initialize(Bootstrap<MacheteConfiguration> bootstrap) {
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(
                        bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );

        bootstrap.addCommand(new RenderCommand());
        bootstrap.addBundle(new MigrationsBundle<MacheteConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(MacheteConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        });

        bootstrap.addBundle(new JooqBundle<MacheteConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(MacheteConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
    
            @Override
            public JooqFactory getJooqFactory(MacheteConfiguration configuration) {
                return configuration.getJooqFactory();
            }
        });
        
        bootstrap.addBundle(hibernateBundle);
        bootstrap.addBundle(new ViewBundle<MacheteConfiguration>() {
            @Override
            public Map<String, Map<String, String>> getViewConfiguration(MacheteConfiguration configuration) {
                return configuration.getViewRendererConfiguration();
            }
        });
        bootstrap.addBundle(new AssetsBundle("/swagger-ui", "/swagger", "index.html", "swagger"));

    }

    @Override
    public void run(MacheteConfiguration configuration, Environment environment) {
        // TODO Dependency Injection should handle object creation 
        final PersonDAO dao = new PersonDAO(hibernateBundle.getSessionFactory());
        // final EmployersDao employersDao = new EmployersDao();
        final Template template = configuration.buildTemplate();

        environment.healthChecks().register("template", new TemplateHealthCheck(template));
        environment.admin().addTask(new EchoTask());
        environment.jersey().register(DateRequiredFeature.class);
        environment.jersey().register(new AuthDynamicFeature(new BasicCredentialAuthFilter.Builder<User>()
                .setAuthenticator(new MacheteAuthenticator())
                .setAuthorizer(new MacheteAuthorizer())
                .setRealm("SUPER SECRET STUFF")
                .buildAuthFilter()));
        environment.jersey().register(new AuthValueFactoryProvider.Binder<>(User.class));
        environment.jersey().register(RolesAllowedDynamicFeature.class);
        environment.jersey().register(new MacheteResource(template));
        environment.jersey().register(new ViewResource());
        environment.jersey().register(new ProtectedResource());
        environment.jersey().register(new PeopleResource(dao));
        environment.jersey().register(new PersonResource(dao));
        environment.jersey().register(new FilteredResource());
        // environment.jersey().register(new EmployersResource(employersDao));
        OpenAPI oas = new OpenAPI();
        Info info = new Info()
                .title("Machete API")
                .description("RESTful greetings for you.")
                .termsOfService("http://example.com/terms")
                .contact(new Contact().email("john@example.com"));
     
        oas.info(info);

        List<Server> servers = new ArrayList<>();
        servers.add(new Server().url("/"));
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
