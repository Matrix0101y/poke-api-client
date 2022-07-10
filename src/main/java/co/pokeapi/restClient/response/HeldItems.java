package co.pokeapi.restClient.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class HeldItems {
    private Item item;
    private List<VersionDetail> version_details;
}
