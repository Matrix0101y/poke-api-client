package co.pokeapi.service;

import co.pokeapi.data.dto.response.MyPokeApiApiResponseDto;

public interface PokeApiService {

    MyPokeApiApiResponseDto getPokemons();
}
