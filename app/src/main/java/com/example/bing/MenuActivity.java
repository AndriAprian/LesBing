package com.example.bing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button profil,latihan_btn,hasil_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        profil = findViewById(R.id.profil);
        latihan_btn = findViewById(R.id.Latihan_btn);
        hasil_btn = findViewById(R.id.Hasil_btn);


        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profil = new Intent(MenuActivity.this,Profil.class);
                startActivity(profil);
            }
        });
        latihan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent latihan_btn = new Intent(MenuActivity.this,HomeActivity.class);
                startActivity(latihan_btn);
            }
        });
        hasil_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profil = new Intent(MenuActivity.this,HasilActivity.class);
                startActivity(profil);
            }
        });
    }
}
