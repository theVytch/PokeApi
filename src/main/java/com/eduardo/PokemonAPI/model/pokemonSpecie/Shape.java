package com.eduardo.PokemonAPI.model.pokemonSpecie;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shape {

    private String name;

    private Shape(){}

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
