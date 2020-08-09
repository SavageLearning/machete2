package machete;

import io.dropwizard.setup.Environment;
import com.codahale.metrics.health.HealthCheck;

// The class checks for two things: that the provided template is actually a well-formed format string, 
// and that the template actually produces output with the given name.
// if not well-formed, throw an IllegalFormatException and check fail.
public class MacheteV2TemplateHealthCheck extends HealthCheck {
    private final String template;

    public MacheteV2TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(template, "TEST");
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }

    // @Override
    public void run(MacheteV2Configuration configuration,
                    Environment environment) {
        final MacheteV2Resource resource = new MacheteV2Resource(
            configuration.getTemplate(),
            configuration.getDefaultName()
        );
        final MacheteV2TemplateHealthCheck healthCheck =
            new MacheteV2TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }
}