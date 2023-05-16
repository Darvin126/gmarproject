package com.example.gmarproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity implements View.OnClickListener {
Button reg;
EditText username, password, cpass;
DBHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DBHelper(this);
        username = findViewById(R.id.username);
        password = findViewById(R.id.Password);
        cpass = findViewById(R.id.Passwordcon);
        reg = findViewById(R.id.register);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String passcon = cpass.getText().toString();

                if (user.equals("") || pass.equals("") || passcon.equals(""))
                    Toast.makeText(register.this, "please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    if (pass.equals(passcon)){
                        Boolean checkuser = db.checkusername(user);
                        if(checkuser == false){
                            Boolean insert = db.insertData(user,pass);
                            if (insert == true){
                                Toast.makeText(register.this, "registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }else {
                                Toast.makeText(register.this, "registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(register.this, "user already exists! please sign in", Toast.LENGTH_SHORT).show();
                    }
                    }
                    else {
                        Toast.makeText(register.this, "passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}