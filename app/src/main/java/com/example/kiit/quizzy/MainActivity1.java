package com.example.kiit.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {

    protected Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        start = findViewById(R.id.Start);

        start.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showIntent(view);
                    }
                }
        );
    }
    public void showIntent(View v){
        Intent intent = new Intent(this, InstructionPage2.class);
        finishAffinity();
        startActivity(intent);
    }
    public void showFragment(View v) {

        View view = findViewById(R.id.Start);
        view.setVisibility(View.INVISIBLE);
        Fragment f = new InstructionPage();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.activity1, f);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }
}