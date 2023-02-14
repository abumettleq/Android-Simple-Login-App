package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner dropdown;
    ArrayList<String> list = new ArrayList<String>();
    private Button contBtn;

    private String chosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add("IUT");
        list.add("BUET");
        list.add("UGV");
        list.add("Not Listed");

        dropdown = findViewById(R.id.spinner1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list);
        dropdown.setAdapter(adapter);

        contBtn = findViewById(R.id.contBtn);
        
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                chosen = list.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
        
        contBtn.setOnClickListener((v)->{
            Intent nextActivity = new Intent(getApplicationContext(),LoginActivity.class);
            nextActivity.putExtra("chosenUniversity",chosen);
            startActivity(nextActivity);
        });

    }
}