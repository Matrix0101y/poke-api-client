package co.pokeapi.data.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Versions {
    @JsonProperty("generation-i")
    private GenerationI generation;
    @JsonProperty("generation-ii")
    private GenerationII generation_Ii;
    @JsonProperty("generation-iii")
    private GenerationIII generation_Iii;
    @JsonProperty("generation-iv")
    private GenerationIV generation_Iv;
    @JsonProperty("generation-v")
    private GenerationV generation_V;
    @JsonProperty("generation-vi")
    private GenerationVI generation_Vi;
    @JsonProperty("generation-vii")
    private GenerationVII generation_Vii;
    @JsonProperty("generation-viii")
    private GenerationVIII generation_Viii;
}
