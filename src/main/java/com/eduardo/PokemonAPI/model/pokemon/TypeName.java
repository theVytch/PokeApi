package com.eduardo.PokemonAPI.model.pokemon;

public class TypeName {

    private String name;

    private TypeName(){}

    public TypeName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
