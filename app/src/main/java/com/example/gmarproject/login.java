package com.example.gmarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//gist.github.com/CHR1ST14N02/a26e720d9c4a7ad7dfe0fbc1f05b9989
public class login extends AppCompatActivity implements View.OnClickListener {
EditText username, password;
Button login, register1;
DBHelper db;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DBHelper(this);
        username = findViewById(R.id.username1);
        password = findViewById(R.id.Password1);
        register1 = findViewById(R.id.register1);
        register1.setOnClickListener(this);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                Toast.makeText(login.this,user + " " + pass, Toast.LENGTH_SHORT).show();
                Toast.makeText(login.this, "sign in successfully", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(getApplicationContext(), MainActivity.class);
               // startActivity(intent);
                if (user.equals("") || pass.equals(""))
                   Toast.makeText(login.this, "please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkuserpass = db.checkusernamepassword(user, pass);
                    if(checkuserpass == true){
                        Toast.makeText(login.this, "sign in successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(login.this, "password and/or username incorrect", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view == register1){
            Intent intent = new Intent(getApplicationContext(), register.class);
            startActivity(intent);
        }


    }
}