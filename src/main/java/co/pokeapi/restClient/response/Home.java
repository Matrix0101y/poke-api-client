package co.pokeapi.restClient.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Home {
    private String front_default;
    private String front_female;
    private String front_shiny;
    private String front_shiny_female;
}
