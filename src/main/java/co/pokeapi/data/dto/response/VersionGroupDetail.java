package co.pokeapi.data.dto.response;

import lombok.Data;

@Data
public class VersionGroupDetail {
    private int level_learned_at;
    private MoveLearnMethod move_learn_method;
    private VersionGroup version_group;
}
