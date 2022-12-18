package com.manav.fitplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity_boy extends AppCompatActivity implements View.OnClickListener {
    public ImageView button1,button2,button3,period4,abs,leg,chest,bicep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_boy);


        button1 = (ImageView) findViewById(R.id.exerciseCard);
        button2 = (ImageView) findViewById(R.id.bmiCard);
        button3 =(ImageView) findViewById(R.id.DietCard);
        period4= (ImageView) findViewById(R.id.period1);

        abs=(ImageView)findViewById(R.id.abs_workout);
        leg=(ImageView)findViewById(R.id.leg_workout);
        chest=(ImageView)findViewById(R.id.chest_workout);
        bicep=(ImageView)findViewById(R.id.bicep_workout);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_boy.this,exercise.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_boy.this,bmi.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_boy.this,Diet.class);
                startActivity(intent);
            }
        });
        period4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_boy.this,VideoActivity.class);
                startActivity(intent);
            }
        });


        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_boy.this,abs.class);
                startActivity(intent);
            }
        });
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_boy.this,legs.class);
                startActivity(intent);
            }
        });
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_boy.this,chest.class);
                startActivity(intent);
            }
        });
        bicep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_boy.this,biceps.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}