package io.github.artefactop.pokedex.presentation;

import java.util.List;

import io.github.artefactop.pokedex.domain.model.Pokemon;
import io.github.artefactop.pokedex.domain.usecase.GetPokemonListUseCase;

public class PokedexPresenterImpl implements PokedexPresenter {
    private View view;
    private GetPokemonListUseCase getPokemonListUseCase;

    public PokedexPresenterImpl(View view, GetPokemonListUseCase useCase) {
        this.view = view;
        getPokemonListUseCase = useCase;
    }

    @Override
    public void onRequestPokemonList() {
        List<Pokemon> pokemons = getPokemonListUseCase.execute();
        view.renderPokemons(pokemons);
    }

}
