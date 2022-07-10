package co.pokeapi.restClient;

import co.pokeapi.config.UrlConfiguration;
import co.pokeapi.restClient.response.RestClientPokeApiResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PokeApiRestClientService {

    private final UrlConfiguration urlConfiguration;
    private final RestClient restClient;

    public RestClientPokeApiResponseDto getPokemons() {
        return restClient.restTemplateOfExchange(urlConfiguration.getPokeApiUrl());
    }


}
