package com.example.kiit.quizzy;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import static com.example.kiit.quizzy.Question.score;


public class Q2 extends AppCompatActivity {

    RadioGroup options;
    int flag = 0;
    int prev = score[1];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        options = findViewById(R.id.rg1);
        options.clearCheck();
        options.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.radioButton4 && flag == 0){
                    score[1] = prev + 1;
                    flag = 1;
                }
                else{
                    score[1] = prev;
                    flag = 0;
                }
                //Toast.makeText(getContext(), "Correct", Toast.LENGTH_SHORT).show();

            }
        });
        findViewById(R.id.next2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Q3.class);
                startActivity(i);
            }
        });
    }


}
