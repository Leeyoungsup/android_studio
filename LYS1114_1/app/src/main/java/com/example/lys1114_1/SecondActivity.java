package com.example.lys1114_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        Button btnNewActivity1 = (Button) findViewById(R.id.btnNewActivity1);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        btnNewActivity1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,
                        ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}