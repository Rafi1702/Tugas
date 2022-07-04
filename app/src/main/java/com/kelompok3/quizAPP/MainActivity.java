package com.kelompok3.quizAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton imgbtn,imgbtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtn= (ImageButton) findViewById(R.id.quiz_1);
        imgbtn2 = (ImageButton) findViewById(R.id.quiz_2);
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, quiz2.class));
            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, quiz1.class));
            }
        });
    }
    public void openActivity(){
        Intent tes = new Intent(MainActivity.this, quiz1.class);
        startActivity(tes);
    }
}