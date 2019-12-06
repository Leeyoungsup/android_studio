package com.example.lys1017_6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int R1X,R1Y,R2X,R2Y,R3X,R3Y;
        final LinearLayout R1 = (LinearLayout)findViewById(R.id.r1) ;
        final LinearLayout R2 = (LinearLayout)findViewById(R.id.r2) ;
        final LinearLayout R3 = (LinearLayout)findViewById(R.id.r3) ;


        R1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(),"높이"+R1.getHeight()+"너비"+R1.getWidth(), Toast.LENGTH_SHORT).show();

            }
        });
        R2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "높이"+R2.getHeight()+"너비"+R2.getWidth(), Toast.LENGTH_SHORT).show();

            }
        });
        R3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "높이"+R3.getHeight()+"너비"+R3.getWidth(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
