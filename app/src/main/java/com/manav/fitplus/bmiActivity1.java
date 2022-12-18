package com.manav.fitplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class bmiActivity1 extends AppCompatActivity {

    android.widget.Button mrecalculatebmi;
    TextView mbmidisplay,mbmicateogry,mgender;
    Intent intent;
    ImageView mimageview;
    String mbmi;
    float intbmi;

    String height;
    String weight;
    float intheight,intweight;
    RelativeLayout mbackground;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi1);



        intent= getIntent();

        mbmidisplay=findViewById(R.id.bmidisplay);
        mbmicateogry=findViewById(R.id.bmicategory);
        mgender=findViewById(R.id.genderDisplay);
        mbackground=findViewById(R.id.contentlayout);
        mimageview=findViewById(R.id.imageView);
        mrecalculatebmi=findViewById(R.id.re_calculateBmi);
        height=intent.getStringExtra("height");
        weight= intent.getStringExtra("weight");

        intheight=Float.parseFloat(height);
        intweight=Float.parseFloat(weight);


        intheight= intheight/100;
        intbmi= intweight/(intheight*intheight);

        mbmi=Float.toString(intbmi);






        if(intbmi<16.1)
        {
            mbmicateogry.setText("Severe Thinness");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.crosss);

        }

        else if (intbmi<16.9 && intbmi>16)
        {
            mbmicateogry.setText("Moderate Thinness");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if (intbmi<18.4 && intbmi>17)
        {
            mbmicateogry.setText("Mild Thinness");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }

        else if (intbmi<25 && intbmi>18.4)
        {
            mbmicateogry.setText("Normal");
            mimageview.setImageResource(R.drawable.ok);
        }

        else if (intbmi<29.4 && intbmi>25)
        {
            mbmicateogry.setText("Over Weight");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else
        {
            mbmicateogry.setText("Not Valid Values");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }

        mgender.setText(intent.getStringExtra("gender"));
        mbmidisplay.setText(mbmi);




        mrecalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( bmiActivity1.this,bmi.class);
                startActivity(intent);
                finish();
            }
        });
    }
}