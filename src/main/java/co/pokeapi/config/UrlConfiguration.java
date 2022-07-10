package co.pokeapi.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class UrlConfiguration {
    @Value("${pokeapi.url}")
    private String pokeApiUrl;
}