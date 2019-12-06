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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv,btnE_x,btnX_Y,btn1X,btnLog,btnLn,btnTan,btnAbsX,btnCos,btnSin,btnRad,btnRoot,btnUpper,btnC;
    TextView textResult;
    String num1, num2;
    float result;

    // 10개 숫자 버튼 배열
    Button[] numButtons = new Button[10];
    // 10개 숫자 버튼의 id 값 배열
    Integer[] numBtnIDs = { R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2,
            R.id.BtnNum3, R.id.BtnNum4, R.id.BtnNum5, R.id.BtnNum6,
            R.id.BtnNum7, R.id.BtnNum8, R.id.BtnNum9 };
    int i; // 증가값 용도

    @Override
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
                break;
            case R.id.op2:
                Intent intent1 = new Intent(getApplicationContext(),
                        matrix3_3.class);
                startActivity(intent1);
                break;
            case R.id.op3:
                Intent intent2= new Intent(getApplicationContext(),
                        matrix4_4.class);
                startActivity(intent2);
                break;
            case R.id.op4:
                Intent intent3= new Intent(getApplicationContext(),
                        matrix5_5.class);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("공학용 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnDiv=(Button) findViewById(R.id.BtnDiv);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnE_x = (Button) findViewById(R.id.BtnE_x);
        btnX_Y = (Button) findViewById(R.id.BtnX_Y);
        btn1X = (Button) findViewById(R.id.Btn1_X);
        btnLog = (Button) findViewById(R.id.BtnLog);
        btnLn = (Button) findViewById(R.id.BtnLn);
        btnTan = (Button) findViewById(R.id.BtnTan);
        btnAbsX = (Button) findViewById(R.id.BtnAbsX);
        btnCos = (Button) findViewById(R.id.BtnCos);
        btnSin = (Button) findViewById(R.id.BtnSin);
        btnRad = (Button) findViewById(R.id.BtnRad);
        btnRoot = (Button) findViewById(R.id.BtnRoot);
        btnUpper = (Button) findViewById(R.id.BtnUpper);
        btnC = (Button) findViewById(R.id.BtnC);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Float.parseFloat(num1) + Float.parseFloat(num2);
                textResult.setText(Float.toString(result));
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Float.parseFloat(num1) - Float.parseFloat(num2);
                textResult.setText(Float.toString(result));
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Float.parseFloat(num1) * Float.parseFloat(num2);
                textResult.setText(Float.toString(result));
                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Float.parseFloat(num1) / Float.parseFloat(num2);
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnUpper.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                edit1.setText(textResult.getText());
                edit2.setText("");
                return false;
            }
        });
        btnC.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                edit1.setText("");
                edit2.setText("");
                textResult.setText("");
                return false;
            }
        });
        btnRoot.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result = (float) Math.sqrt(Double.parseDouble(num1));
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnRad.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result = (float) Math.toRadians(Double.parseDouble(num1));
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnSin.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result = (float) Math.sin(Double.parseDouble(num1));
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnCos.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result = (float) Math.cos(Double.parseDouble(num1));
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnTan.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result = (float) Math.tan(Double.parseDouble(num1));
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnLn.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result = (float) Math.log(Double.parseDouble(num1));
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnLog.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result = (float) Math.log10(Double.parseDouble(num1));
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btn1X.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result = 1/ Float.parseFloat(num1);
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnX_Y.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = (float) Math.pow(Double.parseDouble(num1),Double.parseDouble(num2));
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnE_x.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result = (float) Math.exp(Double.parseDouble(num1));
                textResult.setText(Float.toString(result));
                return false;
            }
        });
        btnAbsX.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edit1.getText().toString();

                result =Math.abs(Float.parseFloat(num1));
                textResult.setText(Float.toString(result));
                return false;
            }
        });


        // 숫자 버튼 10개를 대입
        for (i = 0; i < numBtnIDs.length; i++) {
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }
        // 숫자 버튼 10개에 대해서 클릭이벤트 처리
        for (i = 0; i < numBtnIDs.length; i++) {

            final int index; // 주의! 꼭 필요함..
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // 포커스가 되어 있는 에디트텍스트에 숫자 추가
                    if (edit1.isFocused() == true) {
                        num1 = edit1.getText().toString()
                                + numButtons[index].getText().toString();
                        edit1.setText(num1);
                    } else if (edit2.isFocused() == true) {
                        num2 = edit2.getText().toString()
                                + numButtons[index].getText().toString();
                        edit2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(),
                                "먼저 에디트텍스트를 선택하세요",Toast.LENGTH_SHORT).show();

                    }

                }
            });

        }

    }

}