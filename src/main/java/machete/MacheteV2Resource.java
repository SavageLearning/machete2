package machete;

import machete.MacheteV2Saying;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

@Path("/machete")
@Produces(MediaType.APPLICATION_JSON)
public class MacheteV2Resource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public MacheteV2Resource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public MacheteV2Saying sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        return new MacheteV2Saying(counter.incrementAndGet(), value);
    }

}