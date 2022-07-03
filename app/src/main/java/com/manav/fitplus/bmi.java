package com.manav.fitplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class bmi extends AppCompatActivity {
    android.widget.Button mcalculateBmi;

    TextView mcurrentHeight;
    TextView mcurrentAge , mcurrentWeight;
    ImageView mdecrementweight, mdecrementage , mincrementweight,mincrementage;
    SeekBar mseekbarforheight;
    RelativeLayout mmale, mfemale;

    int intweight=55;
    int intage= 22;
    int currentprogress;
    String mintprogress;
    String typeofuser="170";
    String weight2="55";
    String age2="22";










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().hide();

        mcalculateBmi=findViewById(R.id.calculateBmi);

        mcurrentAge=findViewById(R.id.currentage);
        mcurrentWeight=findViewById(R.id.currentweight);
        mcurrentHeight=findViewById(R.id.currentHeight);
        mincrementage=findViewById(R.id.incrementAge);
        mdecrementage=findViewById(R.id.decrementage);
        mdecrementweight=findViewById(R.id.decrementWeight);
        mincrementweight=findViewById(R.id.incrementWeight);
        mseekbarforheight=findViewById(R.id.seekbarforheight);
        mmale=findViewById(R.id.male);
        mfemale=findViewById(R.id.female);



        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.focus));
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.notfocus));
                typeofuser="Male";
            }
        });

        mfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.focus));
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.notfocus));
                typeofuser="Female";
            }
        });

        mseekbarforheight.setMax(300);
        mseekbarforheight.setProgress(170);
        mseekbarforheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentprogress=progress;
                mintprogress=String.valueOf(currentprogress);
                mcurrentHeight.setText(mintprogress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        mincrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intage=intage+1;
                age2=String.valueOf(intage);
                mcurrentAge.setText(age2);
            }
        });

        mdecrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intage=intage-1;
                age2=String.valueOf(intage);
                mcurrentAge.setText(age2);
            }
        });


        mincrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intweight=intweight+1;
                weight2=String.valueOf(intweight);
                mcurrentWeight.setText(weight2);
            }
        });

        mdecrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intweight=intweight-1;
                weight2=String.valueOf(intweight);
                mcurrentWeight.setText(weight2);
            }
        });








        mcalculateBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(typeofuser.equals("0"))
                {
                    Toast.makeText(getApplicationContext(),"Select Your Gender First",Toast.LENGTH_SHORT).show();
                }

                else if(mintprogress.equals("0"))
                {
                    Toast.makeText(getApplicationContext(),"Select Your Height First",Toast.LENGTH_SHORT).show();
                }
                else if(intage==0|| intage<0)
                {
                    Toast.makeText(getApplicationContext(),"Age Is Incorrect",Toast.LENGTH_SHORT).show();
                }
                else if(intweight==0|| intweight<0)
                {
                    Toast.makeText(getApplicationContext(),"Weight Is Incorrect",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(bmi.this, bmiActivity1.class);
                    intent.putExtra("gender",typeofuser);
                    intent.putExtra("height",mintprogress);
                    intent.putExtra("weight",weight2);
                    intent.putExtra("age",age2);
                    startActivity(intent);

                }


            }
        });
    }
}