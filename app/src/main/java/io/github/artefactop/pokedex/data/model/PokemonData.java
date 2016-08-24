package io.github.artefactop.pokedex.data.model;

public class PokemonData {
    private long id;
    private String imageUrl;
    private String name;
    private String description;

    private PokemonData(){}

    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        private final PokemonData pokemonData = new PokemonData();
        public PokemonData build(){
            return pokemonData;
        }
        public Builder setId(long id){
            pokemonData.id=id;
            return this;
        }
        public Builder setName(String name){
            pokemonData.name=name;
            return this;
        }
        public Builder setDescription(String description){
            pokemonData.description=description;
            return this;
        }
        public Builder setImageUrl(String imageUrl){
            pokemonData.imageUrl=imageUrl;
            return this;
        }
    }
}
