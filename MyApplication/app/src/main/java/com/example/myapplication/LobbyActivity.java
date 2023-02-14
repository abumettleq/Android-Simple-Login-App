package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LobbyActivity extends AppCompatActivity {
    private Button logoutBtn,myInfoBtn;
    private TextView universityTeller;
    private String chosen;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        universityTeller = findViewById(R.id.uniTeller);
        logoutBtn = findViewById(R.id.logoutBtn);
        myInfoBtn = findViewById(R.id.myInfoBtn);

        if(chosen == null) chosen = getIntent().getExtras().getString("chosenUniversity");

        universityTeller.setText("You have chosen " + chosen + " as your university!");

        myInfoBtn.setOnClickListener((v)->{
            Intent nextActivity = new Intent(getApplicationContext(),myInfoActivity.class);
            startActivity(nextActivity);
        });

        logoutBtn.setOnClickListener((v)->{
            chosen = null;
            Intent nextActivity = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(nextActivity);
        });
    }
}
