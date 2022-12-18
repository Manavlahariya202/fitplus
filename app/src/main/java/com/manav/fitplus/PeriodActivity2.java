package com.manav.fitplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PeriodActivity2 extends AppCompatActivity {



    android.widget.Button mrecalculateperiod;
    TextView mbmidisplay;
    Intent intent;
    ImageView mimageview;
    String mperiod;
    Integer intperiod;

    String day;
    String count;
    String time;
    Integer intday,intcount,inttime;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period2);







        intent= getIntent();

        mbmidisplay=findViewById(R.id.perioddisplay);


        mimageview=findViewById(R.id.imageView);



        mrecalculateperiod=findViewById(R.id.re_calculateperiod);


        day=intent.getStringExtra("day");
        count= intent.getStringExtra("count");
        time= intent.getStringExtra("time");

        intday=Integer.parseInt(day);
        intcount=Integer.parseInt(count);
        inttime=Integer.parseInt(time);



        intperiod= inttime+intcount-(30-intday);

        mperiod=Integer.toString(intperiod);









        mbmidisplay.setText(mperiod);




        mrecalculateperiod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( PeriodActivity2.this,period.class);
                startActivity(intent);
                finish();
            }
        });






    }
}