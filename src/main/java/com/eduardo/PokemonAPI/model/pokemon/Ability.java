package com.eduardo.PokemonAPI.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ability {

    @JsonProperty("ability")
    private AbilityName abilityName;

    public Ability(){}

    public Ability(AbilityName abilityName) {
        this.abilityName = abilityName;
    }

    public AbilityName getAbilityName() {
        return abilityName;
    }

    public void setAbilityName(AbilityName abilityName) {
        this.abilityName = abilityName;
    }
}
