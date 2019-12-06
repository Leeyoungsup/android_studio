package com.example.lys1010_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    Button Btn1;
    CheckBox Enabled, Clickable, rotation;
    ImageView img1;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn1 = (Button) findViewById(R.id.Btn1);
        Enabled = (CheckBox) findViewById(R.id.Enabled);
        Clickable = (CheckBox) findViewById(R.id.Clickable);
        rotation = (CheckBox) findViewById(R.id.rotation);
        img1=(ImageView)findViewById(R.id.IMG1);
        Enabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Enabled.isChecked() == true) {

                    Btn1.setEnabled(true);
                } else {
                    Btn1.setEnabled(false);
                }
            }
        });
        Clickable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Clickable.isChecked() == true) {
                    Btn1.setClickable(true);
                } else {
                    Btn1.setClickable(false);
                }
            }
        });
        rotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rotation.isChecked() == true) {
                    Btn1.setRotation(45);
                } else {
                    Btn1.setRotation(0);
                }
            }
        });
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                img1.setImageResource(R.drawable.api43);
                img1.setVisibility(View.VISIBLE);
                count+=1;
            }else{
                    img1.setVisibility(View.INVISIBLE);
                    count+=1;
                }
        }



    });
    }
}
