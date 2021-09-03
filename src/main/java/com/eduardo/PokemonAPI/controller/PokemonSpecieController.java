package com.eduardo.PokemonAPI.controller;

import com.eduardo.PokemonAPI.model.pokemonSpecie.PokemonSpecie;
import com.eduardo.PokemonAPI.service.PokemonSpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon-species")
public class PokemonSpecieController {

    @Autowired
    private PokemonSpeciesService pokemonSpeciesService;

    @GetMapping
    public String getAllPokemonSpecie(){
        return  pokemonSpeciesService.getAllPokemonSpecie();
    }

    @GetMapping("/{pokemonName}")
    public PokemonSpecie getPokemonSpecie(@PathVariable("pokemonName") String pokemonName) {
        return pokemonSpeciesService.getPokemonSpecie(pokemonName);
    }
}
