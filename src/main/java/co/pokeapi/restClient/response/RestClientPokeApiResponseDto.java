package co.pokeapi.restClient.response;

import lombok.Data;

import java.util.List;

@Data
public class RestClientPokeApiResponseDto {
    public List<Ability> abilities;
    private Long base_experience;
    private List<Form> forms;
    private List<GameIndices> game_indices;
    private Long height;
    private List<HeldItems> held_items;
    private Long id;
    private boolean is_default;
    private String location_area_encounters;
    private List<Move> moves;
    private String name;
    private int order;
    private List<PastType> past_types;
    private Species species;
    private Sprites sprites;
    private List<Stats> stats;
    private List<Type> types;
    private int weight;
}
