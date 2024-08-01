package com.rajan.androidview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViews extends AppCompatActivity {

    ListView listView;
    ArrayList<PersonObject> listOfPerson = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 12);
        String occupation = intent.getStringExtra("occupation");
        String address = intent.getStringExtra("address");

        listOfPerson.add(new PersonObject(name, age, occupation, address));

        listView = findViewById(R.id.listView);

        ListViewAdapter listViewAdapter = new ListViewAdapter(ListViews.this, listOfPerson);
        listView.setAdapter(listViewAdapter);
    }
}
