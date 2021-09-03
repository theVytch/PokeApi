package com.eduardo.PokemonAPI.model.pokemonSpecie;

public class Habitat {

    private String name;

    private Habitat(){}

    public Habitat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
