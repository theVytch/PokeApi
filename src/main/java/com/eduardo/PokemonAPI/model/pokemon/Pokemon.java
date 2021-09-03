package com.eduardo.PokemonAPI.model.pokemon;

import java.util.List;

public class Pokemon {

    private Integer id;
    private String name;
    private List<Type> types;
    private List<Ability> abilities;

    //private Pokemon(){}  // isso aqui é o mesmo que o de cima
    private Pokemon(){}

    public Pokemon(Integer id, String name, List<Type> types, List<Ability> abilities) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.abilities = abilities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }
}
