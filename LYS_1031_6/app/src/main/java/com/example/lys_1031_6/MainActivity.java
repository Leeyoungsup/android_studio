package com.example.lys_1031_6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    Button btn;
    ImageView img;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        rg = (RadioGroup) findViewById(R.id.gr);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                View dlgView = View.inflate(MainActivity.this,R.layout.dialog,null);
                img = (ImageView) dlgView.findViewById(R.id.imageView1);
                dlg.setView(dlgView);
                switch (rg.getCheckedRadioButtonId()) {
                    case R.id.rd1:
                        dlg.setTitle("강아지");
                        img.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rd2:
                        dlg.setTitle("고양이");
                        img.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rd3:
                        dlg.setTitle("토끼");
                        img.setImageResource(R.drawable.rabbit);
                        break;
                    case R.id.rd4:
                        dlg.setTitle("말");
                        img.setImageResource(R.drawable.horse);
                        break;
                }
                dlg.setPositiveButton("닫기",null);
                dlg.show();
            }
        });
    }
}
