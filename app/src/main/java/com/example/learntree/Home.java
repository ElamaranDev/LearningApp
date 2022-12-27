package com.example.learntree;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView abc = (CardView) findViewById(R.id.alphabets);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Alphabets.class);
                startActivity(i);
            }
        });
        CardView num= (CardView) findViewById(R.id.numbers);
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Numbers.class);
                startActivity(i);
            }
        });
        CardView drawing= (CardView) findViewById(R.id.drawing);
        drawing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Drawing.class);
                startActivity(i);
            }
        });
        CardView tamil = (CardView) findViewById(R.id.tamil);
        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Tamil.class);
                startActivity(i);
            }
        });
        CardView vegetables = (CardView) findViewById(R.id.vegetables);
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Vegetables.class);
                startActivity(i);
            }
        });
        CardView fruits = (CardView) findViewById(R.id.fruits);
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Fruits.class);
                startActivity(i);
            }
        });
        CardView shapes = (CardView) findViewById(R.id.shapes);
        shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Shapes.class);
                startActivity(i);
            }
        });
        CardView weekdays = (CardView) findViewById(R.id.weekdays);
        weekdays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Weekdays.class);
                startActivity(i);
            }
        });
        CardView months = (CardView) findViewById(R.id.months);
        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Months.class);
                startActivity(i);
            }
        });
        CardView quiz = (CardView) findViewById(R.id.quiz);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), Quiz.class);
                startActivity(i);
            }
        });
    }
//    @Override
//    public void onBackPressed() {
//        new AlertDialog.Builder(getApplicationContext()).setMessage("Aru you sure do you want to exit?")
//                .setCancelable(false)
//                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        finish();
//                    }
//                })
//                .setNegativeButton("NO", null).show();
//    }
}