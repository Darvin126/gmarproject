package com.example.gmarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11;
    Button mmd;
    TextToSpeech t1;
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
        cb11 = findViewById(R.id.checkBox11);
        cb11.setOnClickListener(this);
        mmd = findViewById(R.id.mmd);
        mmd.setOnClickListener(this);

        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                    t1.setPitch(1.0f);
                    t1.setSpeechRate(0.9f);
                }
            }
        });

    }
    public void alfa1(View view, CheckBox cb){
        AlphaAnimation alp = new AlphaAnimation(1,0.5F);
        alp.setDuration(600);
        alp.setFillAfter(true);
        cb.startAnimation(alp);
    }
    public void alfa2(View view, CheckBox cb){
        AlphaAnimation alp = new AlphaAnimation(0.5F,1);
        alp.setDuration(600);
        alp.setFillAfter(true);
        cb.startAnimation(alp);
    }

    @Override
    public void onClick(View v) {
        if( v == cb1 && cb1.isChecked()){
            String toSpeak = cb1.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb1, cb1);
        }
        else if(v == cb1 && !cb1.isChecked()){
            alfa2(cb1, cb1);
        }
        if( v == cb2 && cb2.isChecked()){
            String toSpeak = cb2.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb2, cb2);
        }
        else if(v == cb2 && !cb2.isChecked()){
            alfa2(cb2, cb2);
        }
        if( v == cb3 && cb3.isChecked()){
            String toSpeak = cb3.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb3, cb3);
        }
        else if(v == cb3 && !cb3.isChecked()){
            alfa2(cb3, cb3);
        }
        if( v == cb4 && cb4.isChecked()){
            String toSpeak = cb4.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb4, cb4);
        }
        else if(v == cb4 && !cb4.isChecked()){
            alfa2(cb4, cb4);
        }
        if( v == cb5 && cb5.isChecked()){
            String toSpeak = cb5.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb5, cb5);
        }
        else if(v == cb5 && !cb5.isChecked()){
            alfa2(cb5, cb5);
        }
        if( v == cb6 && cb6.isChecked()){
            String toSpeak = cb6.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb6, cb6);
        }
        else if(v == cb6 && !cb6.isChecked()){
            alfa2(cb6, cb6);
        }
        if( v == cb7 && cb7.isChecked()){
            String toSpeak = cb7.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb7, cb7);
        }
        else if(v == cb7 && !cb7.isChecked()){

            alfa2(cb7, cb7);
        }
        if( v == cb8 && cb8.isChecked()){
            String toSpeak = cb8.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb8, cb8);
        }
        else if(v == cb8 && !cb8.isChecked()){
            alfa2(cb8, cb8);
        }
        if( v == cb9 && cb9.isChecked()){
            String toSpeak = cb9.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb9, cb9);
        }
        else if(v == cb9 && !cb9.isChecked()){
            alfa2(cb9, cb9);
        }
        if( v == cb10 && cb10.isChecked()){
            String toSpeak = cb10.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb10, cb10);
        }
        else if(v == cb10 && !cb10.isChecked()){
            alfa2(cb10, cb10);
        }
        if( v == cb11 && cb11.isChecked()){
            String toSpeak = cb11.getText().toString();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            alfa1(cb11, cb11);
        }
        else if(v == cb11 && !cb11.isChecked()){
            alfa2(cb11, cb11);
        }

        if (v == mmd){
            String[] ing = new String[10];
            Intent intent = new Intent(getApplicationContext(), recepies.class);
            if (cb1.isChecked() == true){
                intent.putExtra("cb1", cb1.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb2", cb2.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb3", cb3.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb4", cb4.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb5", cb5.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb6", cb6.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb7", cb7.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb8", cb8.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb9", cb9.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb10", cb10.getText());
            }
            if (cb1.isChecked() == true){
                intent.putExtra("cb11", cb11.getText());
            }
            startActivity(intent);
        }


    }
    public void onPause() {
        if (t1 != null) {
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }
}