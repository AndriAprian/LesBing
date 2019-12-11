package com.example.bing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button latihan1,latihan2,latihan3,latihan4,latihan5,mulai_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        latihan1 = findViewById(R.id.latihan1);
        latihan2 = findViewById(R.id.latihan2);
        latihan3 = findViewById(R.id.latihan3);
        latihan4 = findViewById(R.id.latihan4);
        latihan5 = findViewById(R.id.latihan5);



        latihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent latihan1 = new Intent(HomeActivity.this,QuizActivity.class);
                startActivity(latihan1);
            }
        });
        latihan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent latihan2 = new Intent(HomeActivity.this,QuizActivity.class);
                startActivity(latihan2);
            }
        });
        latihan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent latihan3 = new Intent(HomeActivity.this,QuizActivity.class);
                startActivity(latihan3);
            }
        });
        latihan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent latihan4 = new Intent(HomeActivity.this,QuizActivity.class);
                startActivity(latihan4);
            }
        });
        latihan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent latihan5 = new Intent(HomeActivity.this,QuizActivity.class);
                startActivity(latihan5);
            }
        });
    }
}
