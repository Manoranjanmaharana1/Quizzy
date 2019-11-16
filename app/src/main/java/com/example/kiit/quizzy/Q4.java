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


public class Q4 extends AppCompatActivity {


    RadioGroup options;
    int flag = 0;
    int prev = score[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
        options = findViewById(R.id.rg3);
        options.clearCheck();
        options.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.radioButton4 && flag == 0){
                    score[3] = prev + 1;
                    flag = 1;
                }
                else{
                    score[3] = prev;
                    flag = 0;
                }
                //Toast.makeText(getContext(), "Correct", Toast.LENGTH_SHORT).show();

            }
        });
        findViewById(R.id.next4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Q5.class);
                startActivity(i);
            }
        });
    }


}
