package io.github.artefactop.pokedex.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import io.github.artefactop.pokedex.R;
import io.github.artefactop.pokedex.domain.model.Pokemon;
import io.github.artefactop.pokedex.presentation.PokedexPresenter;
import io.github.artefactop.pokedex.presentation.PokedexPresenterFactory;
import io.github.artefactop.pokedex.view.adapter.PokemonListAdapter;

public class MainActivity extends AppCompatActivity implements PokedexPresenter.View {
    private ListView listView;
    private PokedexPresenter pokedexPresenter;
    private PokemonListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeList();
        initializePresenter();
    }

    private void initializePresenter() {
        pokedexPresenter = PokedexPresenterFactory.getPresenter(this);
        pokedexPresenter.onRequestPokemonList();
    }

    private void initializeList(){
        adapter = new PokemonListAdapter(this);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    @Override
    public void renderPokemons(List<Pokemon> pokemons) {
        adapter.clear();
        adapter.addAll(pokemons);
        adapter.notifyDataSetChanged();
    }
}
