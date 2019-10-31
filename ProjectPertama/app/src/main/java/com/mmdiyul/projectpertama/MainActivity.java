package com.mmdiyul.projectpertama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mmdiyul.projectpertama.adapters.SuperHeroAdapter;
import com.mmdiyul.projectpertama.models.SuperHero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);

        SuperHero hero = new SuperHero("Superman", this.getResources().getDrawable(R.drawable.superman));
        listSuperHero.add(hero);

        hero = new SuperHero("Batman", this.getResources().getDrawable(R.drawable.batman));
        listSuperHero.add(hero);

        hero = new SuperHero("Captain America", this.getResources().getDrawable(R.drawable.captain));
        listSuperHero.add(hero);

        hero = new SuperHero("Green Lanter", this.getResources().getDrawable(R.drawable.green));
        listSuperHero.add(hero);

        hero = new SuperHero("The Incridibles", this.getResources().getDrawable(R.drawable.incridibles));
        listSuperHero.add(hero);

        hero = new SuperHero("Wonder Woman", this.getResources().getDrawable(R.drawable.wonder));
        listSuperHero.add(hero);

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);

        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
