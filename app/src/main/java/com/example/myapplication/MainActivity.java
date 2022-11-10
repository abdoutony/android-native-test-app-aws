package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterList.ItemClickListener {
        AdapterList adapter;
       /* Parcelable recyclerScrollPosition;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");






        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       /* DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);*/
        /*recyclerScrollPosition = savedInstanceState.getParcelable("scrollPosition")*/
        adapter = new AdapterList(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

   /* @Override
    public void onSaveInstanceState(Bundle outState ) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("scrollPosition",recyclerView.layoutManager.onSaveInstanceState());
    }*/

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}