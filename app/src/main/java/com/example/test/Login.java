package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    private TextView signUp;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 어플을 처음 실행 했을 때 생명주기
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,SignUp.class);
                startActivity(intent);
            }
        });

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, MainUi.class);
                startActivity(intent);
            }
        });

    }
}