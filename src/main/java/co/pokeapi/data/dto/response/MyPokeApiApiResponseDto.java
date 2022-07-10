package co.pokeapi.data.dto.response;

import co.pokeapi.restClient.response.Ability;
import co.pokeapi.restClient.response.Form;
import co.pokeapi.restClient.response.GameIndices;
import co.pokeapi.restClient.response.HeldItems;
import co.pokeapi.restClient.response.Move;
import co.pokeapi.restClient.response.PastType;
import co.pokeapi.restClient.response.Species;
import co.pokeapi.restClient.response.Sprites;
import co.pokeapi.restClient.response.Stats;
import co.pokeapi.restClient.response.Type;
import lombok.Data;

import java.util.List;

@Data
public class MyPokeApiApiResponseDto {
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
