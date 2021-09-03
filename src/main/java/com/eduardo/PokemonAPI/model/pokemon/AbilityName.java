package com.eduardo.PokemonAPI.model.pokemon;

public class AbilityName {

    private String name;

    private AbilityName(){}

    public AbilityName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
