package com.example.kiit.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Question extends AppCompatActivity {

    static int []score = {0,0,0,0,0};
    Button res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        res = findViewById(R.id.submit);
        res.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

              showRes(v);
            }
        });
    }
    public void showRes(View v){
        Intent intent = new Intent(this, Res.class);
        finishAffinity();
        startActivity(intent);
    }
}
