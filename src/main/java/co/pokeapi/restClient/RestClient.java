package co.pokeapi.restClient;

import co.pokeapi.config.UrlConfiguration;
import co.pokeapi.restClient.response.RestClientPokeApiResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Component
@RequiredArgsConstructor
public class RestClient {

    private final UrlConfiguration urlConfiguration;
    private final RestTemplate restTemplate;

    public RestClientPokeApiResponseDto restTemplateOfExchange(String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Application");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<RestClientPokeApiResponseDto> responseJson = restTemplate.exchange(urlConfiguration.getPokeApiUrl(), HttpMethod.GET, entity, RestClientPokeApiResponseDto.class);
        return responseJson.getBody();
    }

}