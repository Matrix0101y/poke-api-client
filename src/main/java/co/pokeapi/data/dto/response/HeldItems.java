package co.pokeapi.data.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class HeldItems {
    private Item item;
    private List<VersionDetail> version_details;
}
