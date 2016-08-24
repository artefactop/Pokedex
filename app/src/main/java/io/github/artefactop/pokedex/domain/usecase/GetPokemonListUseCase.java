package io.github.artefactop.pokedex.domain.usecase;

import java.util.List;

import io.github.artefactop.pokedex.data.repository.PokemonRepository;
import io.github.artefactop.pokedex.domain.model.Pokemon;

public class GetPokemonListUseCase {

    private PokemonRepository repository;

    public GetPokemonListUseCase(PokemonRepository repository){
        this.repository = repository;
    }

    public List<Pokemon> execute(){
        return repository.getPokemonList();
    }
}
