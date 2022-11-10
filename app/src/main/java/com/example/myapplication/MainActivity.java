package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterList.ItemClickListener {
    AdapterList adapter;
    /* Parcelable recyclerScrollPosition;*/
    RecyclerView recyclerView;
    private int mTotalScrolled = 0;

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
        recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       /* DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);*/
        /*recyclerScrollPosition = savedInstanceState.getParcelable("scrollPosition")*/
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                mTotalScrolled += dy;
                Context context = getApplicationContext();
                System.out.println("mtotal scrolleed :" + mTotalScrolled);

            }
        });

        adapter = new AdapterList(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Page2Activity.class);
                intent.putExtra("posscroll", Integer.toString(mTotalScrolled));
                startActivity(intent);
            }
        });
    }


    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}


