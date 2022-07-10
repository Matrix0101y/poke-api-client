package co.pokeapi.mapper;

import co.pokeapi.data.dto.response.MyPokeApiApiResponseDto;
import co.pokeapi.restClient.response.RestClientPokeApiResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ToDto {
    ToDto INSTANCE = Mappers.getMapper(ToDto.class);
    MyPokeApiApiResponseDto toDto(RestClientPokeApiResponseDto pokeApiResponseDto);
}
