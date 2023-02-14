package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class myInfoActivity extends AppCompatActivity {
    private TextView infoTeller1,infoTeller2,infoTeller3,infoTeller4,infoTeller5,infoTeller6;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myinfo);

        infoTeller1 = findViewById(R.id.infoTeller1);
        infoTeller2 = findViewById(R.id.infoTeller2);
        infoTeller3 = findViewById(R.id.infoTeller3);
        infoTeller4 = findViewById(R.id.infoTeller4);
        infoTeller5 = findViewById(R.id.infoTeller5);
        infoTeller6 = findViewById(R.id.infoTeller6);

        infoTeller1.setText("Computer Science: A+");
        infoTeller2.setText("Math:             A");
        infoTeller3.setText("Biology:          B+");
        infoTeller4.setText("Chemistry:        A+");
        infoTeller5.setText("Physics:          A-");
        infoTeller6.setText("English:          A");
    }
}
