package co.pokeapi.restClient.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VersionGroupDetail {
    private int level_learned_at;
    private MoveLearnMethod move_learn_method;
    private VersionGroup version_group;
}
