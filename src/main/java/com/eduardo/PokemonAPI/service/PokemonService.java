package com.eduardo.PokemonAPI.service;

import com.eduardo.PokemonAPI.model.pokemon.Pokemon;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private static final String POKEMON_URL = "https://pokeapi.co/api/v2/pokemon";


    private final RestTemplate restTemplate = new RestTemplate();

    public String getAllPokemon(){
        ResponseEntity<String> pokemons = restTemplate.getForEntity(POKEMON_URL + "?limit=100", String.class);
        return pokemons.getBody();
    }


    public Pokemon getPokemon(String name){
        ResponseEntity<Pokemon> pokemons = restTemplate.getForEntity(POKEMON_URL + "/" + name.toLowerCase(), Pokemon.class);
        return pokemons.getBody();
    }

}
