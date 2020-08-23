package machete;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import machete.MacheteV2Resource;

public class MacheteV2Application extends Application<MacheteV2Configuration> {

    public static void main(final String[] args) throws Exception {
        new MacheteV2Application().run(args);
    }

    @Override
    public String getName() {
        return "MacheteV2";
    }

    @Override
    public void initialize(final Bootstrap<MacheteV2Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MacheteV2Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
        final String template = configuration.getTemplate();
        final MacheteV2Resource resource = new MacheteV2Resource(
            template, 
            configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }   
}
