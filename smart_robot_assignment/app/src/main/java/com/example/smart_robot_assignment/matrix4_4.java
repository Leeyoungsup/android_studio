package com.example.smart_robot_assignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class matrix4_4 extends AppCompatActivity {
    EditText Xmat1_1,Xmat1_2,Xmat1_3,Xmat2_1,Xmat2_2,Xmat2_3,Xmat3_1,Xmat3_2,Xmat3_3,Ymat1_1,Ymat1_2,Ymat1_3,Ymat2_1,Ymat2_2,Ymat2_3,Ymat3_1,Ymat3_2,Ymat3_3,Xmat1_4,Xmat2_4,Xmat3_4,Xmat4_1,Xmat4_2,Xmat4_3,Xmat4_4,Ymat1_4,Ymat2_4,Ymat3_4,Ymat4_1,Ymat4_2,Ymat4_3,Ymat4_4;
    Button btnrank,btnplus,btndiff,btndiv,btndot,btncross,btneqal,btnC;
    TextView Vmat1_1,Vmat1_2,Vmat1_3,Vmat2_1,Vmat2_2,Vmat2_3,Vmat3_1,Vmat3_2,Vmat3_3,Vmat1_4,Vmat2_4,Vmat3_4,Vmat4_1,Vmat4_2,Vmat4_3,Vmat4_4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_matrix4_4);
        setTitle("Matrix 4X4");
        Xmat1_1=(EditText) findViewById(R.id.Xmat1_1);
        Xmat1_2=(EditText) findViewById(R.id.Xmat1_2);
        Xmat1_3=(EditText) findViewById(R.id.Xmat1_3);
        Xmat2_1=(EditText) findViewById(R.id.Xmat2_1);
        Xmat2_2=(EditText) findViewById(R.id.Xmat2_2);
        Xmat2_3=(EditText) findViewById(R.id.Xmat2_3);
        Xmat3_1=(EditText) findViewById(R.id.Xmat3_1);
        Xmat3_2=(EditText) findViewById(R.id.Xmat3_2);
        Xmat3_3=(EditText) findViewById(R.id.Xmat3_3);
        Xmat1_4=(EditText) findViewById(R.id.Xmat1_4);
        Xmat2_4=(EditText) findViewById(R.id.Xmat2_4);
        Xmat3_4=(EditText) findViewById(R.id.Xmat3_4);
        Xmat4_1=(EditText) findViewById(R.id.Xmat4_1);
        Xmat4_2=(EditText) findViewById(R.id.Xmat4_2);
        Xmat4_3=(EditText) findViewById(R.id.Xmat4_3);
        Xmat4_4=(EditText) findViewById(R.id.Xmat4_4);
        Ymat1_4=(EditText) findViewById(R.id.Ymat1_4);
        Ymat2_4=(EditText) findViewById(R.id.Ymat2_4);
        Ymat3_4=(EditText) findViewById(R.id.Ymat3_4);
        Ymat4_1=(EditText) findViewById(R.id.Ymat4_1);
        Ymat4_2=(EditText) findViewById(R.id.Ymat4_2);
        Ymat4_3=(EditText) findViewById(R.id.Ymat4_3);
        Ymat4_4=(EditText) findViewById(R.id.Ymat4_4);
        Ymat1_1=(EditText) findViewById(R.id.Ymat1_1);
        Ymat1_2=(EditText) findViewById(R.id.Ymat1_2);
        Ymat1_3=(EditText) findViewById(R.id.Ymat1_3);
        Ymat2_1=(EditText) findViewById(R.id.Ymat2_1);
        Ymat2_2=(EditText) findViewById(R.id.Ymat2_2);
        Ymat2_3=(EditText) findViewById(R.id.Ymat2_3);
        Ymat3_1=(EditText) findViewById(R.id.Ymat3_1);
        Ymat3_2=(EditText) findViewById(R.id.Ymat3_2);
        Ymat3_3=(EditText) findViewById(R.id.Ymat3_3);
        Vmat1_1=(TextView)findViewById(R.id.Vmat1_1);
        Vmat1_2=(TextView)findViewById(R.id.Vmat1_2);
        Vmat1_3=(TextView)findViewById(R.id.Vmat1_3);
        Vmat2_1=(TextView)findViewById(R.id.Vmat2_1);
        Vmat2_2=(TextView)findViewById(R.id.Vmat2_2);
        Vmat2_3=(TextView)findViewById(R.id.Vmat2_3);
        Vmat3_1=(TextView)findViewById(R.id.Vmat3_1);
        Vmat3_2=(TextView)findViewById(R.id.Vmat3_2);
        Vmat3_3=(TextView)findViewById(R.id.Vmat3_3);
        Vmat1_4=(TextView)findViewById(R.id.Vmat1_4);
        Vmat2_4=(TextView)findViewById(R.id.Vmat2_4);
        Vmat3_4=(TextView)findViewById(R.id.Vmat3_4);
        Vmat4_1=(TextView)findViewById(R.id.Vmat4_1);
        Vmat4_2=(TextView)findViewById(R.id.Vmat4_2);
        Vmat4_3=(TextView)findViewById(R.id.Vmat4_3);
        Vmat4_4=(TextView)findViewById(R.id.Vmat4_4);
        btncross=(Button)findViewById(R.id.btncross);
        btndot=(Button)findViewById(R.id.btndot);
        btnrank=(Button)findViewById(R.id.btnrank);
        btneqal=(Button)findViewById(R.id.btneqal);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnplus=(Button)findViewById(R.id.btnplus);
        btndiff=(Button)findViewById(R.id.btndiff);
        btnC=(Button)findViewById(R.id.btnC);
        btnplus.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                float Xmat[][] = { { Float.parseFloat(Xmat1_1.getText().toString()), Float.parseFloat(Xmat1_2.getText().toString()), Float.parseFloat(Xmat1_3.getText().toString()),Float.parseFloat(Xmat1_4.getText().toString()) },
                        { Float.parseFloat(Xmat2_1.getText().toString()), Float.parseFloat(Xmat2_2.getText().toString()), Float.parseFloat(Xmat2_3.getText().toString()),Float.parseFloat(Xmat2_4.getText().toString())},
                        { Float.parseFloat(Xmat3_1.getText().toString()), Float.parseFloat(Xmat3_2.getText().toString()), Float.parseFloat(Xmat3_3.getText().toString()),Float.parseFloat(Xmat3_4.getText().toString()) } ,
                        { Float.parseFloat(Xmat4_1.getText().toString()), Float.parseFloat(Xmat4_2.getText().toString()), Float.parseFloat(Xmat4_3.getText().toString()),Float.parseFloat(Xmat4_4.getText().toString()) } };
                float Ymat[][] = { { Float.parseFloat(Ymat1_1.getText().toString()), Float.parseFloat(Ymat1_2.getText().toString()), Float.parseFloat(Ymat1_3.getText().toString()), Float.parseFloat(Ymat1_4.getText().toString()) },
                        { Float.parseFloat(Ymat2_1.getText().toString()), Float.parseFloat(Ymat2_2.getText().toString()), Float.parseFloat(Ymat2_3.getText().toString()), Float.parseFloat(Ymat2_4.getText().toString())},
                        { Float.parseFloat(Ymat3_1.getText().toString()), Float.parseFloat(Ymat3_2.getText().toString()), Float.parseFloat(Ymat3_3.getText().toString()), Float.parseFloat(Ymat3_4.getText().toString()) },
                        { Float.parseFloat(Ymat4_1.getText().toString()), Float.parseFloat(Ymat4_2.getText().toString()), Float.parseFloat(Ymat4_3.getText().toString()), Float.parseFloat(Ymat4_4.getText().toString()) }};
                Vmat1_1.setText(Float.toString(Xmat[0][0]+Ymat[0][0]));
                Vmat1_2.setText(Float.toString(Xmat[0][1]+Ymat[0][1]));
                Vmat1_3.setText(Float.toString(Xmat[0][2]+Ymat[0][2]));
                Vmat1_4.setText(Float.toString(Xmat[0][3]+Ymat[0][3]));
                Vmat2_1.setText(Float.toString(Xmat[1][0]+Ymat[1][0]));
                Vmat2_2.setText(Float.toString(Xmat[1][1]+Ymat[1][1]));
                Vmat2_3.setText(Float.toString(Xmat[1][2]+Ymat[1][2]));
                Vmat2_4.setText(Float.toString(Xmat[1][3]+Ymat[1][3]));
                Vmat3_1.setText(Float.toString(Xmat[2][0]+Ymat[2][0]));
                Vmat3_2.setText(Float.toString(Xmat[2][1]+Ymat[2][1]));
                Vmat3_3.setText(Float.toString(Xmat[2][2]+Ymat[2][2]));
                Vmat3_4.setText(Float.toString(Xmat[2][3]+Ymat[2][3]));
                Vmat4_1.setText(Float.toString(Xmat[3][0]+Ymat[3][0]));
                Vmat4_2.setText(Float.toString(Xmat[3][1]+Ymat[3][1]));
                Vmat4_3.setText(Float.toString(Xmat[3][2]+Ymat[3][2]));
                Vmat4_4.setText(Float.toString(Xmat[3][3]+Ymat[3][3]));
                return false;
            }
        });
        btndiff.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                float Xmat[][] = { { Float.parseFloat(Xmat1_1.getText().toString()), Float.parseFloat(Xmat1_2.getText().toString()), Float.parseFloat(Xmat1_3.getText().toString()),Float.parseFloat(Xmat1_4.getText().toString()) },
                        { Float.parseFloat(Xmat2_1.getText().toString()), Float.parseFloat(Xmat2_2.getText().toString()), Float.parseFloat(Xmat2_3.getText().toString()),Float.parseFloat(Xmat2_4.getText().toString())},
                        { Float.parseFloat(Xmat3_1.getText().toString()), Float.parseFloat(Xmat3_2.getText().toString()), Float.parseFloat(Xmat3_3.getText().toString()),Float.parseFloat(Xmat3_4.getText().toString()) } ,
                        { Float.parseFloat(Xmat4_1.getText().toString()), Float.parseFloat(Xmat4_2.getText().toString()), Float.parseFloat(Xmat4_3.getText().toString()),Float.parseFloat(Xmat4_4.getText().toString()) } };
                float Ymat[][] = { { Float.parseFloat(Ymat1_1.getText().toString()), Float.parseFloat(Ymat1_2.getText().toString()), Float.parseFloat(Ymat1_3.getText().toString()), Float.parseFloat(Ymat1_4.getText().toString()) },
                        { Float.parseFloat(Ymat2_1.getText().toString()), Float.parseFloat(Ymat2_2.getText().toString()), Float.parseFloat(Ymat2_3.getText().toString()), Float.parseFloat(Ymat2_4.getText().toString())},
                        { Float.parseFloat(Ymat3_1.getText().toString()), Float.parseFloat(Ymat3_2.getText().toString()), Float.parseFloat(Ymat3_3.getText().toString()), Float.parseFloat(Ymat3_4.getText().toString()) },
                        { Float.parseFloat(Ymat4_1.getText().toString()), Float.parseFloat(Ymat4_2.getText().toString()), Float.parseFloat(Ymat4_3.getText().toString()), Float.parseFloat(Ymat4_4.getText().toString()) }};
                Vmat1_1.setText(Float.toString(Xmat[0][0]-Ymat[0][0]));
                Vmat1_2.setText(Float.toString(Xmat[0][1]-Ymat[0][1]));
                Vmat1_3.setText(Float.toString(Xmat[0][2]-Ymat[0][2]));
                Vmat1_4.setText(Float.toString(Xmat[0][3]-Ymat[0][3]));
                Vmat2_1.setText(Float.toString(Xmat[1][0]-Ymat[1][0]));
                Vmat2_2.setText(Float.toString(Xmat[1][1]-Ymat[1][1]));
                Vmat2_3.setText(Float.toString(Xmat[1][2]-Ymat[1][2]));
                Vmat2_4.setText(Float.toString(Xmat[1][3]-Ymat[1][3]));
                Vmat3_1.setText(Float.toString(Xmat[2][0]-Ymat[2][0]));
                Vmat3_2.setText(Float.toString(Xmat[2][1]-Ymat[2][1]));
                Vmat3_3.setText(Float.toString(Xmat[2][2]-Ymat[2][2]));
                Vmat3_4.setText(Float.toString(Xmat[2][3]-Ymat[2][3]));
                Vmat4_1.setText(Float.toString(Xmat[3][0]-Ymat[3][0]));
                Vmat4_2.setText(Float.toString(Xmat[3][1]-Ymat[3][1]));
                Vmat4_3.setText(Float.toString(Xmat[3][2]-Ymat[3][2]));
                Vmat4_4.setText(Float.toString(Xmat[3][3]-Ymat[3][3]));
                return false;
            }
        });
        btndiv.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                float Xmat[][] = { { Float.parseFloat(Xmat1_1.getText().toString()), Float.parseFloat(Xmat1_2.getText().toString()), Float.parseFloat(Xmat1_3.getText().toString()),Float.parseFloat(Xmat1_4.getText().toString()) },
                        { Float.parseFloat(Xmat2_1.getText().toString()), Float.parseFloat(Xmat2_2.getText().toString()), Float.parseFloat(Xmat2_3.getText().toString()),Float.parseFloat(Xmat2_4.getText().toString())},
                        { Float.parseFloat(Xmat3_1.getText().toString()), Float.parseFloat(Xmat3_2.getText().toString()), Float.parseFloat(Xmat3_3.getText().toString()),Float.parseFloat(Xmat3_4.getText().toString()) } ,
                        { Float.parseFloat(Xmat4_1.getText().toString()), Float.parseFloat(Xmat4_2.getText().toString()), Float.parseFloat(Xmat4_3.getText().toString()),Float.parseFloat(Xmat4_4.getText().toString()) } };
                float Ymat[][] = { { Float.parseFloat(Ymat1_1.getText().toString()), Float.parseFloat(Ymat1_2.getText().toString()), Float.parseFloat(Ymat1_3.getText().toString()), Float.parseFloat(Ymat1_4.getText().toString()) },
                        { Float.parseFloat(Ymat2_1.getText().toString()), Float.parseFloat(Ymat2_2.getText().toString()), Float.parseFloat(Ymat2_3.getText().toString()), Float.parseFloat(Ymat2_4.getText().toString())},
                        { Float.parseFloat(Ymat3_1.getText().toString()), Float.parseFloat(Ymat3_2.getText().toString()), Float.parseFloat(Ymat3_3.getText().toString()), Float.parseFloat(Ymat3_4.getText().toString()) },
                        { Float.parseFloat(Ymat4_1.getText().toString()), Float.parseFloat(Ymat4_2.getText().toString()), Float.parseFloat(Ymat4_3.getText().toString()), Float.parseFloat(Ymat4_4.getText().toString()) }};
                Vmat1_1.setText(Float.toString(Xmat[0][0]/Ymat[0][0]));
                Vmat1_2.setText(Float.toString(Xmat[0][1]/Ymat[0][1]));
                Vmat1_3.setText(Float.toString(Xmat[0][2]/Ymat[0][2]));
                Vmat1_4.setText(Float.toString(Xmat[0][3]/Ymat[0][3]));
                Vmat2_1.setText(Float.toString(Xmat[1][0]/Ymat[1][0]));
                Vmat2_2.setText(Float.toString(Xmat[1][1]/Ymat[1][1]));
                Vmat2_3.setText(Float.toString(Xmat[1][2]/Ymat[1][2]));
                Vmat2_4.setText(Float.toString(Xmat[1][3]/Ymat[1][3]));
                Vmat3_1.setText(Float.toString(Xmat[2][0]/Ymat[2][0]));
                Vmat3_2.setText(Float.toString(Xmat[2][1]/Ymat[2][1]));
                Vmat3_3.setText(Float.toString(Xmat[2][2]/Ymat[2][2]));
                Vmat3_4.setText(Float.toString(Xmat[2][3]/Ymat[2][3]));
                Vmat4_1.setText(Float.toString(Xmat[3][0]/Ymat[3][0]));
                Vmat4_2.setText(Float.toString(Xmat[3][1]/Ymat[3][1]));
                Vmat4_3.setText(Float.toString(Xmat[3][2]/Ymat[3][2]));
                Vmat4_4.setText(Float.toString(Xmat[3][3]/Ymat[3][3]));
                return false;
            }
        });
        btncross.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                float Xmat[][] = { { Float.parseFloat(Xmat1_1.getText().toString()), Float.parseFloat(Xmat1_2.getText().toString()), Float.parseFloat(Xmat1_3.getText().toString()),Float.parseFloat(Xmat1_4.getText().toString()) },
                        { Float.parseFloat(Xmat2_1.getText().toString()), Float.parseFloat(Xmat2_2.getText().toString()), Float.parseFloat(Xmat2_3.getText().toString()),Float.parseFloat(Xmat2_4.getText().toString())},
                        { Float.parseFloat(Xmat3_1.getText().toString()), Float.parseFloat(Xmat3_2.getText().toString()), Float.parseFloat(Xmat3_3.getText().toString()),Float.parseFloat(Xmat3_4.getText().toString()) } ,
                        { Float.parseFloat(Xmat4_1.getText().toString()), Float.parseFloat(Xmat4_2.getText().toString()), Float.parseFloat(Xmat4_3.getText().toString()),Float.parseFloat(Xmat4_4.getText().toString()) } };
                float Ymat[][] = { { Float.parseFloat(Ymat1_1.getText().toString()), Float.parseFloat(Ymat1_2.getText().toString()), Float.parseFloat(Ymat1_3.getText().toString()), Float.parseFloat(Ymat1_4.getText().toString()) },
                        { Float.parseFloat(Ymat2_1.getText().toString()), Float.parseFloat(Ymat2_2.getText().toString()), Float.parseFloat(Ymat2_3.getText().toString()), Float.parseFloat(Ymat2_4.getText().toString())},
                        { Float.parseFloat(Ymat3_1.getText().toString()), Float.parseFloat(Ymat3_2.getText().toString()), Float.parseFloat(Ymat3_3.getText().toString()), Float.parseFloat(Ymat3_4.getText().toString()) },
                        { Float.parseFloat(Ymat4_1.getText().toString()), Float.parseFloat(Ymat4_2.getText().toString()), Float.parseFloat(Ymat4_3.getText().toString()), Float.parseFloat(Ymat4_4.getText().toString()) }};
                Vmat1_1.setText(Float.toString(Xmat[0][0]*Ymat[0][0]));
                Vmat1_2.setText(Float.toString(Xmat[0][1]*Ymat[0][1]));
                Vmat1_3.setText(Float.toString(Xmat[0][2]*Ymat[0][2]));
                Vmat1_4.setText(Float.toString(Xmat[0][3]*Ymat[0][3]));
                Vmat2_1.setText(Float.toString(Xmat[1][0]*Ymat[1][0]));
                Vmat2_2.setText(Float.toString(Xmat[1][1]*Ymat[1][1]));
                Vmat2_3.setText(Float.toString(Xmat[1][2]*Ymat[1][2]));
                Vmat2_4.setText(Float.toString(Xmat[1][3]*Ymat[1][3]));
                Vmat3_1.setText(Float.toString(Xmat[2][0]*Ymat[2][0]));
                Vmat3_2.setText(Float.toString(Xmat[2][1]*Ymat[2][1]));
                Vmat3_3.setText(Float.toString(Xmat[2][2]*Ymat[2][2]));
                Vmat3_4.setText(Float.toString(Xmat[2][3]*Ymat[2][3]));
                Vmat4_1.setText(Float.toString(Xmat[3][0]*Ymat[3][0]));
                Vmat4_2.setText(Float.toString(Xmat[3][1]*Ymat[3][1]));
                Vmat4_3.setText(Float.toString(Xmat[3][2]*Ymat[3][2]));
                Vmat4_4.setText(Float.toString(Xmat[3][3]*Ymat[3][3]));
                return false;
            }
        });
        btndot.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                float Xmat[][] = { { Float.parseFloat(Xmat1_1.getText().toString()), Float.parseFloat(Xmat1_2.getText().toString()), Float.parseFloat(Xmat1_3.getText().toString()),Float.parseFloat(Xmat1_4.getText().toString()) },
                        { Float.parseFloat(Xmat2_1.getText().toString()), Float.parseFloat(Xmat2_2.getText().toString()), Float.parseFloat(Xmat2_3.getText().toString()),Float.parseFloat(Xmat2_4.getText().toString())},
                        { Float.parseFloat(Xmat3_1.getText().toString()), Float.parseFloat(Xmat3_2.getText().toString()), Float.parseFloat(Xmat3_3.getText().toString()),Float.parseFloat(Xmat3_4.getText().toString()) } ,
                        { Float.parseFloat(Xmat4_1.getText().toString()), Float.parseFloat(Xmat4_2.getText().toString()), Float.parseFloat(Xmat4_3.getText().toString()),Float.parseFloat(Xmat4_4.getText().toString()) } };
                float Ymat[][] = { { Float.parseFloat(Ymat1_1.getText().toString()), Float.parseFloat(Ymat1_2.getText().toString()), Float.parseFloat(Ymat1_3.getText().toString()), Float.parseFloat(Ymat1_4.getText().toString()) },
                        { Float.parseFloat(Ymat2_1.getText().toString()), Float.parseFloat(Ymat2_2.getText().toString()), Float.parseFloat(Ymat2_3.getText().toString()), Float.parseFloat(Ymat2_4.getText().toString())},
                        { Float.parseFloat(Ymat3_1.getText().toString()), Float.parseFloat(Ymat3_2.getText().toString()), Float.parseFloat(Ymat3_3.getText().toString()), Float.parseFloat(Ymat3_4.getText().toString()) },
                        { Float.parseFloat(Ymat4_1.getText().toString()), Float.parseFloat(Ymat4_2.getText().toString()), Float.parseFloat(Ymat4_3.getText().toString()), Float.parseFloat(Ymat4_4.getText().toString()) }};
                Vmat1_1.setText(Float.toString(Xmat[0][0]*Ymat[0][0]+Xmat[0][1]*Ymat[1][0]+Xmat[0][2]*Ymat[2][0]+Xmat[0][3]*Ymat[3][0]));
                Vmat1_2.setText(Float.toString(Xmat[0][0]*Ymat[0][1]+Xmat[0][1]*Ymat[1][1]+Xmat[0][2]*Ymat[2][1]+Xmat[0][3]*Ymat[3][1]));
                Vmat1_3.setText(Float.toString(Xmat[0][0]*Ymat[0][2]+Xmat[0][1]*Ymat[1][2]+Xmat[0][2]*Ymat[2][2]+Xmat[0][3]*Ymat[3][2]));
                Vmat1_4.setText(Float.toString(Xmat[0][0]*Ymat[0][3]+Xmat[0][1]*Ymat[1][3]+Xmat[0][2]*Ymat[2][3]+Xmat[0][3]*Ymat[3][3]));
                Vmat2_1.setText(Float.toString(Xmat[1][0]*Ymat[0][0]+Xmat[1][1]*Ymat[1][0]+Xmat[1][2]*Ymat[2][0]+Xmat[1][3]*Ymat[3][0]));
                Vmat2_2.setText(Float.toString(Xmat[1][0]*Ymat[0][1]+Xmat[1][1]*Ymat[1][1]+Xmat[1][2]*Ymat[2][1]+Xmat[1][3]*Ymat[3][1]));
                Vmat2_3.setText(Float.toString(Xmat[1][0]*Ymat[0][2]+Xmat[1][1]*Ymat[1][2]+Xmat[1][2]*Ymat[2][2]+Xmat[1][3]*Ymat[3][2]));
                Vmat2_4.setText(Float.toString(Xmat[1][0]*Ymat[0][3]+Xmat[1][1]*Ymat[1][3]+Xmat[1][2]*Ymat[2][3]+Xmat[1][3]*Ymat[3][3]));
                Vmat3_1.setText(Float.toString(Xmat[2][0]*Ymat[0][0]+Xmat[2][1]*Ymat[1][0]+Xmat[2][2]*Ymat[2][0]+Xmat[2][3]*Ymat[3][0]));
                Vmat3_2.setText(Float.toString(Xmat[2][0]*Ymat[0][1]+Xmat[2][1]*Ymat[1][1]+Xmat[2][2]*Ymat[2][1]+Xmat[2][3]*Ymat[3][1]));
                Vmat3_3.setText(Float.toString(Xmat[2][0]*Ymat[0][2]+Xmat[2][1]*Ymat[1][2]+Xmat[2][2]*Ymat[2][2]+Xmat[2][3]*Ymat[3][2]));
                Vmat3_4.setText(Float.toString(Xmat[2][0]*Ymat[0][3]+Xmat[2][1]*Ymat[1][3]+Xmat[2][2]*Ymat[2][3]+Xmat[2][3]*Ymat[3][3]));
                Vmat4_1.setText(Float.toString(Xmat[3][0]*Ymat[0][0]+Xmat[3][1]*Ymat[1][0]+Xmat[3][2]*Ymat[2][0]+Xmat[3][3]*Ymat[3][0]));
                Vmat4_2.setText(Float.toString(Xmat[3][0]*Ymat[0][1]+Xmat[3][1]*Ymat[1][1]+Xmat[3][2]*Ymat[2][1]+Xmat[3][3]*Ymat[3][1]));
                Vmat4_3.setText(Float.toString(Xmat[3][0]*Ymat[0][2]+Xmat[3][1]*Ymat[1][2]+Xmat[3][2]*Ymat[2][2]+Xmat[3][3]*Ymat[3][2]));
                Vmat4_4.setText(Float.toString(Xmat[3][0]*Ymat[0][3]+Xmat[3][1]*Ymat[1][3]+Xmat[3][2]*Ymat[2][3]+Xmat[3][3]*Ymat[3][3]));
                return false;
            }
        });
        btnrank.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                float Xmat[][] = { { Float.parseFloat(Xmat1_1.getText().toString()), Float.parseFloat(Xmat1_2.getText().toString()), Float.parseFloat(Xmat1_3.getText().toString()),Float.parseFloat(Xmat1_4.getText().toString()) },
                        { Float.parseFloat(Xmat2_1.getText().toString()), Float.parseFloat(Xmat2_2.getText().toString()), Float.parseFloat(Xmat2_3.getText().toString()),Float.parseFloat(Xmat2_4.getText().toString())},
                        { Float.parseFloat(Xmat3_1.getText().toString()), Float.parseFloat(Xmat3_2.getText().toString()), Float.parseFloat(Xmat3_3.getText().toString()),Float.parseFloat(Xmat3_4.getText().toString()) } ,
                        { Float.parseFloat(Xmat4_1.getText().toString()), Float.parseFloat(Xmat4_2.getText().toString()), Float.parseFloat(Xmat4_3.getText().toString()),Float.parseFloat(Xmat4_4.getText().toString()) } };
                float rank1=4;
                float rank=4;
                for(int i=0;i<3;i++){
                    for(int j=i+1;j<4;j++){
                        if((Xmat[i][0]/Xmat[j][0]==Xmat[i][1]/Xmat[j][1])&&(Xmat[i][0]/Xmat[j][0]==Xmat[i][2]/Xmat[j][2])&&(Xmat[i][0]/Xmat[j][0]==Xmat[i][3]/Xmat[j][3])){
                            rank1-=1;
                        }

                    }
                }
                if(rank1<=0){

                    rank1=1;
                }
                float rank2=4;
                for(int i=0;i<3;i++){
                    for(int j=i+1;j<4;j++){
                        if((Xmat[0][i]/Xmat[0][j]==Xmat[1][i]/Xmat[1][j])&&(Xmat[0][i]/Xmat[0][j]==Xmat[2][i]/Xmat[2][j])&&(Xmat[0][i]/Xmat[0][j]==Xmat[3][i]/Xmat[3][j])){
                            rank2-=1;
                        }
                    }
                }
                if(rank2<=0){

                    rank2=1;
                }
                if(rank1>=rank2){
                    rank=rank2;
                }
                else{
                    rank=rank1;
                }
                Vmat1_1.setText(Float.toString(rank));
                Vmat1_2.setText("");
                Vmat1_3.setText("");
                Vmat1_4.setText("");
                Vmat2_1.setText("");
                Vmat2_2.setText("");
                Vmat2_3.setText("");
                Vmat2_4.setText("");
                Vmat3_1.setText("");
                Vmat3_2.setText("");
                Vmat3_3.setText("");
                Vmat3_4.setText("");
                Vmat4_1.setText("");
                Vmat4_2.setText("");
                Vmat4_3.setText("");
                Vmat4_4.setText("");
                return false;
            }
        });
        btneqal.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if(Vmat1_1.getText()!="") {
                    Xmat1_1.setText(Vmat1_1.getText());
                    Xmat1_2.setText(Vmat1_2.getText());
                    Xmat1_3.setText(Vmat1_3.getText());
                    Xmat1_4.setText(Vmat1_4.getText());
                    Xmat2_1.setText(Vmat2_1.getText());
                    Xmat2_2.setText(Vmat2_2.getText());
                    Xmat2_3.setText(Vmat2_3.getText());
                    Xmat2_4.setText(Vmat2_4.getText());
                    Xmat3_1.setText(Vmat3_1.getText());
                    Xmat3_2.setText(Vmat3_2.getText());
                    Xmat3_3.setText(Vmat3_3.getText());
                    Xmat3_4.setText(Vmat3_4.getText());
                    Xmat4_1.setText(Vmat4_1.getText());
                    Xmat4_2.setText(Vmat4_2.getText());
                    Xmat4_3.setText(Vmat4_3.getText());
                    Xmat4_4.setText(Vmat4_4.getText());
                    Vmat1_1.setText("");
                    Vmat1_2.setText("");
                    Vmat1_3.setText("");
                    Vmat1_4.setText("");
                    Vmat2_1.setText("");
                    Vmat2_2.setText("");
                    Vmat2_3.setText("");
                    Vmat2_4.setText("");
                    Vmat3_1.setText("");
                    Vmat3_2.setText("");
                    Vmat3_3.setText("");
                    Vmat3_4.setText("");
                    Vmat4_1.setText("");
                    Vmat4_2.setText("");
                    Vmat4_3.setText("");
                    Vmat4_4.setText("");
                }
                return false;
            }
        });
        btnC.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {

                Xmat1_1.setText("");
                Xmat1_2.setText("");
                Xmat1_3.setText("");
                Xmat1_4.setText("");
                Xmat2_1.setText("");
                Xmat2_2.setText("");
                Xmat2_3.setText("");
                Xmat2_4.setText("");
                Xmat3_1.setText("");
                Xmat3_2.setText("");
                Xmat3_3.setText("");
                Xmat3_4.setText("");
                Xmat4_1.setText("");
                Xmat4_2.setText("");
                Xmat4_3.setText("");
                Xmat4_4.setText("");
                Ymat1_1.setText("");
                Ymat1_2.setText("");
                Ymat1_3.setText("");
                Ymat1_4.setText("");
                Ymat2_1.setText("");
                Ymat2_2.setText("");
                Ymat2_3.setText("");
                Ymat2_4.setText("");
                Ymat3_1.setText("");
                Ymat3_2.setText("");
                Ymat3_3.setText("");
                Ymat3_4.setText("");
                Ymat4_1.setText("");
                Ymat4_2.setText("");
                Ymat4_3.setText("");
                Ymat4_4.setText("");

                Vmat1_1.setText("");
                Vmat1_2.setText("");
                Vmat1_3.setText("");
                Vmat1_4.setText("");
                Vmat2_1.setText("");
                Vmat2_2.setText("");
                Vmat2_3.setText("");
                Vmat2_4.setText("");
                Vmat3_1.setText("");
                Vmat3_2.setText("");
                Vmat3_3.setText("");
                Vmat3_4.setText("");
                Vmat4_1.setText("");
                Vmat4_2.setText("");
                Vmat4_3.setText("");
                Vmat4_4.setText("");

                return false;
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.op1:
                Intent intent = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(intent);
                break;
            case R.id.op2:
                Intent intent1 = new Intent(getApplicationContext(),
                        matrix3_3.class);
                startActivity(intent1);
                break;
            case R.id.op3:
                break;
            case R.id.op4:
                Intent intent3= new Intent(getApplicationContext(),
                        matrix5_5.class);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
