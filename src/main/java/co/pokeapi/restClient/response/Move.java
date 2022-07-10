package co.pokeapi.restClient.response;

import lombok.Data;

import java.util.List;

@Data
public class Move {
    private Move2 move;
    private List<VersionGroupDetail>version_group_details;
}
