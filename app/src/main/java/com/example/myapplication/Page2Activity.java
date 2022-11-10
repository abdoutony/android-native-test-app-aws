package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        int pos = Integer.parseInt(getIntent().getStringExtra("posscroll"));
        TextView txt = findViewById(R.id.txtpos);
        txt.setText("scroll position in previous activity : "+ String.valueOf(pos));
    }
}