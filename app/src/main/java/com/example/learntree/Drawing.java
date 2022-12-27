package com.example.learntree;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.learntree.display.colorList;
import static com.example.learntree.display.current_brush;
import static com.example.learntree.display.pathList;
import static java.lang.Integer.parseInt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Drawing extends AppCompatActivity {
    public static Path path=new Path();
    public static Paint paint_brush=new Paint();
    Button home;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);
        home=findViewById(R.id.home_btn);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Home.class);
                startActivity(i);
                overridePendingTransition(0, R.anim.anim_slide_out_right);
                finish();
            }
        });
    }
    public void eraser(View view) {
        paint_brush.setColor(Color.WHITE);
        currentColor(paint_brush.getColor());
    }
    public void pencil(View view){
          pathList.clear();
          colorList.clear();
          path.reset();
    }
    public void black(View view){
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }
    @SuppressLint("ResourceType")
    public void orange(View view){
        paint_brush.setColor(Color.parseColor(getString(R.color.orange)));
        currentColor(paint_brush.getColor());
    }
    @SuppressLint("ResourceType")
    public void blue(View view){
        paint_brush.setColor(Color.parseColor(getString(R.color.blue)));
        currentColor(paint_brush.getColor());
    }
    @SuppressLint("ResourceType")
    public void green(View view){
        paint_brush.setColor(Color.parseColor(getString(R.color.green)));
        currentColor(paint_brush.getColor());
    }
    @SuppressLint("ResourceType")
    public void red(View view){
        paint_brush.setColor(Color.parseColor(getString(R.color.red)));
        currentColor(paint_brush.getColor());
    }
    public void currentColor(int c){
       current_brush=c;
       path = new Path();
    }

}
