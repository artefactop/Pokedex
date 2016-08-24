package io.github.artefactop.pokedex.data.model;


import java.util.ArrayList;
import java.util.List;

import io.github.artefactop.pokedex.domain.model.Pokemon;

public class PokemonDataMapper {
    public static Pokemon map(PokemonData source) {
        return new Pokemon.Builder()
                .setId(source.getId())
                .setName(source.getName())
                .setDescription(source.getDescription())
                .setImageUrl(source.getImageUrl())
                .build();
    }

    public static List<Pokemon> map(List<PokemonData> source) {
        List<Pokemon> result = new ArrayList<>(source.size());
        for (PokemonData pokemonData : source) {
            result.add(map(pokemonData));
        }
        return result;
    }
}
