package com.example.kiit.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstructionPage2 extends AppCompatActivity {

     Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_page2);
        b1 = findViewById(R.id.play);
        b1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                showIn(v);
            }
        });

    }
    public void showIn(View v){
        Intent in = new Intent(this , Q1.class);
        finishAffinity();
        startActivity(in);
    }
}
