package com.example.bing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bing.Database.Database;
import com.example.bing.Entitas.Account;

public class MainActivity extends AppCompatActivity {
Button login,daftar;
EditText textemail,textpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        daftar = findViewById(R.id.daftar);
        textemail = findViewById(R.id.email);
        textpassword = findViewById(R.id.password);


        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Register.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login_clik(v);
            }
        });
    }

    private void Login_clik(View v) {
        Database accountDB = new Database(getApplicationContext());
        String email = textemail.getText().toString();
        String password = textpassword.getText().toString();
        Account account = accountDB.login(email, password);
        if (account == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
            builder.setTitle(R.string.error);
            builder.setMessage(R.string.invalid_account);
            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.show();
        } else {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("account", account);
            startActivity(intent);
        }
    }

}
