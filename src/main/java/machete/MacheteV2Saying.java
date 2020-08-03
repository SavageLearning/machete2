package machete;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class MacheteV2Saying {
    private long id;

    private String content;

    public MacheteV2Saying() {
        // Jackson deserialization
    }

    public MacheteV2Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
