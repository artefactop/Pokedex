package io.github.artefactop.pokedex.presentation;

import java.util.List;

import io.github.artefactop.pokedex.domain.model.Pokemon;

public interface PokedexPresenter {

    void onRequestPokemonList();

    interface View{
        void renderPokemons(List<Pokemon> pokemons);
    }
}
