package co.pokeapi.data.dto.response;

import lombok.Data;

@Data
public class Ability {
    public Ability2 ability;
    public boolean is_hidden;
    public int slot;

}
