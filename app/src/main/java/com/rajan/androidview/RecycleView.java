package com.rajan.androidview;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {
    ArrayList<PersonObject> listOfPerson = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 12);
        String occupation = intent.getStringExtra("occupation");
        String address = intent.getStringExtra("address");

        listOfPerson.add(new PersonObject(name, age, occupation, address));

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(listOfPerson);

        // Set up GridLayoutManager
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2); // 2 columns
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
