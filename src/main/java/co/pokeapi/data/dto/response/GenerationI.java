package co.pokeapi.data.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GenerationI {
    @JsonProperty("blue")
    private RedBlue redBlue;
    private Yellow yellow;
}
