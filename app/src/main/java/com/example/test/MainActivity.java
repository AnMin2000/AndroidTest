package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //    EditText et_id;
//    Button btn_test;
//    Button btn_test2;
    private Button btn_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 어플을 처음 실행 했을 때 생명주기
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class); // 해당 컴포넌트가 무엇을 할것인지 설정
                startActivity(intent); // 실제 액티비티 이동 해주는 구문
            }
        });
    }
}
//        et_id = findViewById(R.id.et_id); //특정 아이디를 이쪽으로 부여해라 약간 스윙의 get 같은거
//        btn_test = findViewById(R.id.btn_test);
//        btn_test2 = findViewById(R.id.button);
//
//        btn_test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                et_id.setText("홍드로이드");
//            }
//        });
//        btn_test2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                et_id.setText("짜장면");
//            }
//        });
