package com.eduardo.PokemonAPI.service;

import com.eduardo.PokemonAPI.model.pokemonSpecie.PokemonSpecie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonSpeciesService {

    private static final String POKEMON_URL = "https://pokeapi.co/api/v2/pokemon-species";

    private final RestTemplate restTemplate = new RestTemplate();

    public String getAllPokemonSpecie(){
        ResponseEntity<String> pokemonSpecie = restTemplate.getForEntity(POKEMON_URL + "?limit=100", String.class);
        return pokemonSpecie.getBody();
    }

    public PokemonSpecie getPokemonSpecie(String name){
        ResponseEntity<PokemonSpecie> pokemonSpecies = restTemplate.getForEntity(POKEMON_URL + "/" + name.toLowerCase(), PokemonSpecie.class);
        return pokemonSpecies.getBody();
    }
}
