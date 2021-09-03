package com.eduardo.PokemonAPI.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Type {

    private Integer slot;

    @JsonProperty("type")
    private TypeName typeName;

    private Type(){}

    public Type(Integer slot, TypeName typeName) {
        this.slot = slot;
        this.typeName = typeName;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }
}
