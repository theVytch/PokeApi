package com.eduardo.PokemonAPI.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Type {

    @JsonProperty("type")
    private TypeName typeName;

    private Type(){}

    public Type(TypeName typeName) {
        this.typeName = typeName;
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }
}
