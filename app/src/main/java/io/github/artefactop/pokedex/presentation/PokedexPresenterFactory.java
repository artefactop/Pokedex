package io.github.artefactop.pokedex.presentation;

import io.github.artefactop.pokedex.data.datasource.PokemonLocalDataSource;
import io.github.artefactop.pokedex.data.repository.PokemonRepository;
import io.github.artefactop.pokedex.domain.usecase.GetPokemonListUseCase;

public class PokedexPresenterFactory {
    public static PokedexPresenter getPresenter(PokedexPresenter.View view){
        return new PokedexPresenterImpl(view, getPokemonListUseCase());
    }

    private static GetPokemonListUseCase getPokemonListUseCase(){
        PokemonRepository repository = getPokemonRepository();
        return new GetPokemonListUseCase(repository);
    }

    private static PokemonRepository getPokemonRepository(){
        PokemonLocalDataSource dataSource = getPokemonLocalDataSource();
        return new PokemonRepository(dataSource);
    }

    private static PokemonLocalDataSource getPokemonLocalDataSource(){
        return new PokemonLocalDataSource();
    }
}
