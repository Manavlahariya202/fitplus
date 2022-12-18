package com.manav.fitplus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public ImageView button1,button2,button3,period4,abs,leg,chest,bicep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button1 = (ImageView) findViewById(R.id.exerciseCard);
        button2 = (ImageView) findViewById(R.id.bmiCard);
        button3 =(ImageView) findViewById(R.id.DietCard);
        period4= (ImageView) findViewById(R.id.period1);
        abs=(ImageView)findViewById(R.id.girl_abs);
        leg=(ImageView)findViewById(R.id.girl_leg);
        chest=(ImageView)findViewById(R.id.girl_chest);
        bicep=(ImageView)findViewById(R.id.girl_bicep);

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
        period4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,selection.class);
                startActivity(intent);
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,abs.class);
                startActivity(intent);
            }
        });
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,legs.class);
                startActivity(intent);
            }
        });
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,chest.class);
                startActivity(intent);
            }
        });
        bicep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,biceps.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}

