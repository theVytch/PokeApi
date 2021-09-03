package com.eduardo.PokemonAPI.model.pokemonSpecie;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Color {

    private String name;

    public Color(){}

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
