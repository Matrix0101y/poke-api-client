package co.pokeapi.data.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GenerationV {
    @JsonProperty("black-white")
    private BlackWhite blackWhite;

}
