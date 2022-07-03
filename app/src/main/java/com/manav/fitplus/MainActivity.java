package com.manav.fitplus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public ImageButton button1,button2,button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (ImageButton) findViewById(R.id.exerciseCard);
        button2 = (ImageButton) findViewById(R.id.bmiCard);
        button3=(ImageButton) findViewById(R.id.DietCard);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,exercise.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,bmi.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Diet.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}

