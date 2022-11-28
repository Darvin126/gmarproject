package com.example.gmarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.checkBox1);
        cb1.setOnClickListener(this);
        cb2 = findViewById(R.id.checkBox2);
        cb2.setOnClickListener(this);
        cb3 = findViewById(R.id.checkBox3);
        cb3.setOnClickListener(this);
        cb4 = findViewById(R.id.checkBox4);
        cb4.setOnClickListener(this);
        cb5 = findViewById(R.id.checkBox5);
        cb5.setOnClickListener(this);
        cb6 = findViewById(R.id.checkBox6);
        cb6.setOnClickListener(this);
        cb7 = findViewById(R.id.checkBox7);
        cb7.setOnClickListener(this);
        cb8 = findViewById(R.id.checkBox8);
        cb8.setOnClickListener(this);
        cb9 = findViewById(R.id.checkBox9);
        cb9.setOnClickListener(this);
        cb10 = findViewById(R.id.checkBox10);
        cb10.setOnClickListener(this);

    }
    public void alfa1(View view, CheckBox cb){
        AlphaAnimation alp = new AlphaAnimation(1,0.2F);
        alp.setDuration(100);
        cb.startAnimation(alp);
    }
    public void alfa2(View view, CheckBox cb){
        AlphaAnimation alp = new AlphaAnimation(0.2F,1);
        alp.setDuration(100);
        cb.startAnimation(alp);
    }

    @Override
    public void onClick(View v) {
        if( v == cb1 && cb1.isChecked()){
            alfa1(cb1, cb1);
        }
        else if(v == cb1 && !cb1.isChecked()){
            alfa2(cb1, cb1);
        }
        if( v == cb2 && cb2.isChecked()){
            alfa1(cb2, cb2);
        }
        else if(v == cb2 && !cb2.isChecked()){
            alfa2(cb2, cb2);
        }
        if( v == cb3 && cb3.isChecked()){
            alfa1(cb3, cb3);
        }
        else if(v == cb3 && !cb3.isChecked()){
            alfa2(cb3, cb3);
        }
        if( v == cb4 && cb4.isChecked()){
            alfa1(cb4, cb4);
        }
        else if(v == cb4 && !cb4.isChecked()){
            alfa2(cb4, cb4);
        }
        if( v == cb5 && cb5.isChecked()){
            alfa1(cb5, cb5);
        }
        else if(v == cb5 && !cb5.isChecked()){
            alfa2(cb5, cb5);
        }
        if( v == cb6 && cb6.isChecked()){
            alfa1(cb6, cb6);
        }
        else if(v == cb6 && !cb6.isChecked()){
            alfa2(cb6, cb6);
        }
        if( v == cb7 && cb7.isChecked()){
            alfa1(cb7, cb7);
        }
        else if(v == cb7 && !cb7.isChecked()){
            alfa2(cb7, cb7);
        }
        if( v == cb8 && cb8.isChecked()){
            alfa1(cb8, cb8);
        }
        else if(v == cb8 && !cb8.isChecked()){
            alfa2(cb8, cb8);
        }
        if( v == cb9 && cb9.isChecked()){
            alfa1(cb9, cb9);
        }
        else if(v == cb9 && !cb9.isChecked()){
            alfa2(cb9, cb9);
        }
        if( v == cb10 && cb10.isChecked()){
            alfa1(cb10, cb10);
        }
        else if(v == cb10 && !cb10.isChecked()){
            alfa2(cb10, cb10);
        }
    }
}