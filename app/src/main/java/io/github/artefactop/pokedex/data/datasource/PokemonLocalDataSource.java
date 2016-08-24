package io.github.artefactop.pokedex.data.datasource;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import io.github.artefactop.pokedex.data.model.PokemonData;

public class PokemonLocalDataSource {
    private Map<Long, PokemonData> cache = new LinkedHashMap<>();

    public PokemonLocalDataSource() {
        for (int i = 1; i <= 100; i++) {
            buildFakePokemon(i, String.format(Locale.getDefault(), "Pokemon %d", i),
                    String.format(Locale.getDefault(), "Description %d", i),
                    "http://lorempixel.com/150/150/animals/");
        }
    }

    private void buildFakePokemon(long id, String name, String description, String imageUrl) {
        PokemonData pokemonData = new PokemonData.Builder()
                .setId(id)
                .setName(name)
                .setDescription(description)
                .setImageUrl(imageUrl)
                .build();
        cache.put(pokemonData.getId(), pokemonData);
    }

    public List<PokemonData> getPokemonList() {
        return new ArrayList<>(cache.values());
    }
}
