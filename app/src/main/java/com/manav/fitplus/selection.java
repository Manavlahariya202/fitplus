package com.manav.fitplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class selection extends AppCompatActivity {
    public ImageView selection2,video2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);



        selection2 = (ImageView) findViewById(R.id.period66);
        video2 = (ImageView) findViewById(R.id.video3);




        selection2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(selection.this,period.class);
                startActivity(intent);
            }
        });
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(selection.this,VideoActivity_girl.class);
                startActivity(intent);
            }
        });
    }
}