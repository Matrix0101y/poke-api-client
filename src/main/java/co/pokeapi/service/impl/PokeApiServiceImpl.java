package co.pokeapi.service.impl;

import co.pokeapi.config.ApplicationConfiguration;
import co.pokeapi.data.dto.response.MyPokeApiApiResponseDto;
import co.pokeapi.restClient.PokeApiRestClientService;
import co.pokeapi.service.PokeApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PokeApiServiceImpl implements PokeApiService {

    private final PokeApiRestClientService pokeApiRestClientService;
    private final ApplicationConfiguration applicationConfiguration;

    @Override
    public MyPokeApiApiResponseDto getPokemons() {
        return applicationConfiguration.getModelMapper().map(pokeApiRestClientService.getPokemons(), MyPokeApiApiResponseDto.class);
    }

}
