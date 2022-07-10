package co.pokeapi.restClient.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Stats {
    @JsonProperty("base_stat")
    private Long base_stat;
    private Long effort;
    private Stat2 stat;
}
