package co.pokeapi.controller;

import co.pokeapi.data.dto.response.MyPokeApiApiResponseDto;
import co.pokeapi.service.PokeApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PokeApiController {

    private final PokeApiService pokeApiService;

    @GetMapping("pokemons")
    private ResponseEntity<MyPokeApiApiResponseDto> getPokemons() {
        return ResponseEntity.ok(pokeApiService.getPokemons());
    }

}
