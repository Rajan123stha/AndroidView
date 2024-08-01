package com.rajan.androidview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, ageEditText, occupationEditText, addressEditText;

    String name;
    int age; // Changed to int
    String occupation;
    String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        nameEditText = findViewById(R.id.name);
        ageEditText = findViewById(R.id.age);
        occupationEditText = findViewById(R.id.occupation);
        addressEditText = findViewById(R.id.address);
        Button addBtn = findViewById(R.id.btn_add);
        Button listViewBtn = findViewById(R.id.btn_listView);
        Button gridViewBtn = findViewById(R.id.btn_gridView);
        Button recyclerViewBtn = findViewById(R.id.btn_recycleView);

        // Set onClick listeners for buttons
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameEditText.getText().toString();
                age = Integer.parseInt(ageEditText.getText().toString()); // Parse age to int
                occupation = occupationEditText.getText().toString();
                address = addressEditText.getText().toString();
            }
        });

        listViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViews.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                intent.putExtra("occupation", occupation);
                intent.putExtra("address", address);
                startActivity(intent);
            }
        });

        // The following buttons' implementation are commented out for now

        gridViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                intent.putExtra("occupation", occupation);
                intent.putExtra("address", address);
                startActivity(intent);
            }
        });

        recyclerViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecycleView.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                intent.putExtra("occupation", occupation);
                intent.putExtra("address", address);
                startActivity(intent);
            }
        });

    }
}
