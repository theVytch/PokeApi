package com.eduardo.PokemonAPI.controller;

import com.eduardo.PokemonAPI.model.pokemon.Pokemon;
import com.eduardo.PokemonAPI.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public String getAllPokemon(){
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/{pokemonName}")
    public Pokemon getPokemon(@PathVariable("pokemonName") String pokemonName){
        return pokemonService.getPokemon(pokemonName);
    }

}
