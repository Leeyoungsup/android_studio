package com.example.lys_1107_6;


import android.content.Context;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final static int LINE = 1, CIRCLE = 2, RECT = 3;
    static int curShape = LINE;
    static int col = Color.RED;
    static List<MyShape> myshape = new ArrayList<MyShape>();
    static MyShape myshapes;


    private static class MyShape{
        int shapeType;
        int startX, startY, stopX, stopY;
        int color;
        public MyShape(){
            shapeType = LINE;
            color = Color.RED;
        }
        public MyShape(int cur, int co){
            shapeType=cur;
            color=co;
        }

        public void display(Canvas canvas){
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(5);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(color);

            switch (shapeType){
                case LINE:
                    canvas.drawLine(startX,startY,stopX,stopY,paint);
                    break;
                case CIRCLE:
                    int radius = (int)Math.sqrt(Math.pow(stopX-startX, 2)+Math.pow(stopY-startX,2));
                    canvas.drawCircle(startX,startY,radius,paint);
                    break;
                case RECT:
                    canvas.drawRect(startX,startY,stopX,stopY,paint);
                    break;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
        setTitle("간단 그림판");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,"선 그리기");
        menu.add(0,2,0,"원 그리기");
        menu.add(0,3,0,"사각형 그리기");
        menu.add(0,4,0,"삭제");
        SubMenu sMenu = menu.addSubMenu("색상 변경 >>");
        sMenu.add(0,5,0,"빨강");
        sMenu.add(0,6,0,"초록");
        sMenu.add(0,7,0,"파랑");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()) {
            case 1:
                curShape = LINE;
                return true;
            case 2:
                curShape = CIRCLE;
                return true;
            case 3:
                curShape = RECT;
                return true;
            case 4:
                myshape.removeAll(myshape); //invalidate(), onDraw() 확인 필요 클릭하면 바로 삭제가 안됨
                return true;
            case 5:
                col=Color.RED;
                return true;
            case 6:
                col=Color.GREEN;
                return true;
            case 7:
                col=Color.BLUE;
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private static class MyGraphicView extends View {
        int startX = -1, startY = -1, stopX = -1, stopY = -1;


        public MyGraphicView(Context context){
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {

            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    myshapes = new MyShape(curShape,col);
                    myshapes.startX = (int) event.getX();
                    myshapes.startY = (int) event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                case MotionEvent.ACTION_UP:
                    myshapes.stopX = (int) event.getX();
                    myshapes.stopY = (int) event.getY();
                    myshape.add(myshapes);
                    this.invalidate();
                    break;
            }
            return true;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            for(MyShape myshapes : myshape){
                myshapes.display(canvas);
            }
        }
    }
}
