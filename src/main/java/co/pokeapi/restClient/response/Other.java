package co.pokeapi.restClient.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Other {
    private DreamWorld dream_world;
    private Home home;
    @JsonProperty("official-artwork")
    private OfficialArtwork officialArtwork;
}
