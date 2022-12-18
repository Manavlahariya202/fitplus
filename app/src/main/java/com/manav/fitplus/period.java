package com.manav.fitplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class period extends AppCompatActivity {
    android.widget.Button mcalculatePeriod;

    TextView mcurrentmonth , mcurrentday , mcurrentcount, mcurrenttime;
    ImageView mdecrementday, mdecrementmonth , mincrementday,mincrementmonth ,mincrementcount, mdecrementcount ,mincrementtime,mdecrementtime;


    int intday=15;
    int intmonth= 6;
    int intcount=4;
    int inttime=25;

    String day2="16";
    String month2="7";
    String count2="3";
    String time2="25";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period);


        mcalculatePeriod=findViewById(R.id.calculatePeriod);

        mcurrentday=findViewById(R.id.currentday);
        mcurrentmonth=findViewById(R.id.currentmonth);


        mincrementmonth=findViewById(R.id.incrementmonth);
        mdecrementmonth=findViewById(R.id.decrementmonth);
        mdecrementday=findViewById(R.id.decrementday);
        mincrementday=findViewById(R.id.incrementDay);

        mcurrentcount=findViewById(R.id.currentcount);
        mincrementcount=findViewById(R.id.incrementcount);
        mdecrementcount=findViewById(R.id.decrementcount);



        mcurrenttime=findViewById(R.id.currenttime);
        mincrementtime=findViewById(R.id.incrementtime);
        mdecrementtime=findViewById(R.id.decrementtime);



        mincrementmonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intmonth=intmonth+1;
                month2=String.valueOf(intmonth);
                mcurrentmonth.setText(month2);
            }
        });

        mdecrementmonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intmonth=intmonth-1;
                month2=String.valueOf(intmonth);
                mcurrentmonth.setText(month2);
            }
        });







        mincrementday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intday=intday+1;
                day2=String.valueOf(intday);
                mcurrentday.setText(day2);
            }
        });

        mdecrementday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intday=intday-1;
                day2=String.valueOf(intday);
                mcurrentday.setText(day2);
            }
        });


        mincrementcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intcount=intcount+1;
                count2=String.valueOf(intcount);
                mcurrentcount.setText(count2);
            }
        });

        mdecrementcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intcount=intcount-1;
                count2=String.valueOf(intcount);
                mcurrentcount.setText(count2);
            }
        });





        mincrementtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inttime=inttime+1;
                time2=String.valueOf(inttime);
                mcurrenttime.setText(time2);
            }
        });

        mdecrementtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inttime=inttime-1;
                time2=String.valueOf(inttime);
                mcurrenttime.setText(time2);
            }
        });


        mcalculatePeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(period.this, PeriodActivity2.class);
                    intent.putExtra("month",month2);
                    intent.putExtra("day",day2);
                    intent.putExtra("count",count2);
                    intent.putExtra("time",time2);
                    startActivity(intent);

                }


            });










    }
}