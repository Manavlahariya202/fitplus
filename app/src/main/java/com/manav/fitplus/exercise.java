package com.manav.fitplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class exercise extends AppCompatActivity {
    public ImageView button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);



        button1 = (ImageView) findViewById(R.id.bicep);
        button2 = (ImageView) findViewById(R.id.leg);
        button3=(ImageView) findViewById(R.id.chest);
        button4=(ImageView) findViewById(R.id.abs);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(exercise.this,biceps.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(exercise.this,legs.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(exercise.this,chest.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(exercise.this,abs.class);
                startActivity(intent);
            }
        });
    }
}