package io.github.artefactop.pokedex.data.repository;

import java.util.List;

import io.github.artefactop.pokedex.data.datasource.PokemonLocalDataSource;
import io.github.artefactop.pokedex.data.model.PokemonData;
import io.github.artefactop.pokedex.data.model.PokemonDataMapper;
import io.github.artefactop.pokedex.domain.model.Pokemon;

public class PokemonRepository {
    private final PokemonLocalDataSource localDataSource;

    public PokemonRepository(PokemonLocalDataSource localDataSource){
        this.localDataSource = localDataSource;
    }

    public List<Pokemon> getPokemonList() {
        List<PokemonData> pokemonDataList = localDataSource.getPokemonList();
        return PokemonDataMapper.map(pokemonDataList);
    }
}
