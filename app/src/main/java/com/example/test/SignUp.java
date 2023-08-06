package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    private Button signUp, check;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // id 필드와 pw 필드 값 가져 와서 데이터베이스에 저장 하는 로직 추가
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });

//        check = findViewById(R.id.check);
//        check.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // 중복 확인 로직 추가
//            }
//        });
    }
}