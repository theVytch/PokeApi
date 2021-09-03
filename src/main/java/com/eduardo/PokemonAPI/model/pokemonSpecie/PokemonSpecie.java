package com.eduardo.PokemonAPI.model.pokemonSpecie;

public class PokemonSpecie {

    private Integer id;
    private String name;
    private Color color;
    private boolean is_legendary;
    private boolean is_mythical;
    private Shape shape;
    private Habitat habitat;

    private PokemonSpecie(){}

    public PokemonSpecie(Integer id, String name, Color color, boolean is_legendary, boolean is_mythical, Shape shape, Habitat habitat) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.is_legendary = is_legendary;
        this.is_mythical = is_mythical;
        this.shape = shape;
        this.habitat = habitat;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isIs_legendary() {
        return is_legendary;
    }

    public void setIs_legendary(boolean is_legendary) {
        this.is_legendary = is_legendary;
    }

    public boolean isIs_mythical() {
        return is_mythical;
    }

    public void setIs_mythical(boolean is_mythical) {
        this.is_mythical = is_mythical;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
}
