package com.rajan.androidview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

//import com.Amisha.myapplication.R;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<PersonObject> listOfPerson = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 12);
        String occupation = intent.getStringExtra("occupation");
        String address = intent.getStringExtra("address");

        listOfPerson.add(new PersonObject(name, age, occupation, address));
        GridView gridView = findViewById(R.id.gridView);

        GridViewAdapter gridViewAdapter=new GridViewAdapter(GridViewActivity.this,listOfPerson);

        gridView.setAdapter(gridViewAdapter);


    }
}