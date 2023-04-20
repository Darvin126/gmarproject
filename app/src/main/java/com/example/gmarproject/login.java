package com.example.gmarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//gist.github.com/CHR1ST14N02/a26e720d9c4a7ad7dfe0fbc1f05b9989
public class login extends AppCompatActivity implements View.OnClickListener {
EditText username, password, register1;
Button login;
DBHelper db;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.Password);
        register1 = findViewById(R.id.register1);
        register1.setOnClickListener(this);
        db = new DBHelper(this);
        login = findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == register1){
            Intent intent = new Intent(getApplicationContext(),login.class);
            startActivity(intent);
        }


    }
}