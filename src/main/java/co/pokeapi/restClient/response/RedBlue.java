package co.pokeapi.restClient.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RedBlue {
    private String back_default;
    private String back_gray;
    private String back_transparent;
    private String front_default;
    private String front_gray;
    private String front_transparent;
}
