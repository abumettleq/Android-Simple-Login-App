package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private Button loginBtn;
    private EditText loginUsername, loginPassword;
    private String chosen;

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);

        View view = activity.getCurrentFocus();

        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.loginBtn);
        loginUsername = findViewById(R.id.username_field);
        loginPassword = findViewById(R.id.password_field);

        loginBtn.setOnClickListener((v)->{
            hideKeyboard(this);
            if(chosen == null)
            {
                chosen = getIntent().getExtras().getString("chosenUniversity");
            }
            switch (chosen)
            {
                case "IUT":
                case "BUET":
                case "UGV": {
                    if(loginUsername.getText().toString().equals("190041145") && loginPassword.getText().toString().equals("password"))
                    {
                        Toast.makeText(this, "Logged in successfully!", Toast.LENGTH_SHORT).show();
                        Intent nextActivity = new Intent(getApplicationContext(),LobbyActivity.class);
                        nextActivity.putExtra("chosenUniversity",chosen);
                        chosen = null;
                        startActivity(nextActivity);
                    }
                    else {
                        Toast.makeText(this, "Wrong username or password!", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                default:
                    Toast.makeText(this, "Choose a valid university!", Toast.LENGTH_SHORT).show();
                    break;
            }
        });
    }

}
