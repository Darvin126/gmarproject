package com.example.gmarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity implements View.OnClickListener {
Button reg;
EditText username, password, cpass;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.Password);
        cpass = (EditText) findViewById(R.id.Passwordcon1);
        reg = findViewById(R.id.register);
        reg.setOnClickListener(register.this);
    }

    @Override
    public void onClick(View view) {

            if (view == reg){
                String user = username.getText().toString();
                String pass = password.getText().toString();

            }

    }
}