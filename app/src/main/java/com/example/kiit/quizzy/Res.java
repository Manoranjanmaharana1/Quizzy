package com.example.kiit.quizzy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.kiit.quizzy.Question.score;


public class Res extends AppCompatActivity {

    TextView res;
    Button restart,quit, share;
    int in = score[0]+score[1]+score[2]+score[3]+score[4];
    String sc = in+"/5";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        res = findViewById(R.id.tt);
        restart = findViewById(R.id.replay2);
        quit = findViewById(R.id.quit);
        share = findViewById(R.id.share);
        res.setText(sc);
        quit.setOnClickListener( new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(Res.this, "Thank You and have a Nice day ahead!!",Toast.LENGTH_LONG).show();
                System.gc();
                System.exit(0);

            }

        });
        restart.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                showQues(v);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SENDTO);

                i.setData(Uri.parse("smsto:"));
                i.putExtra("sms_body","Hey.. just scored " + in + " out of 5.");

                startActivity(i);
            }
        });

    }
    public void showQues(View v){
        score[0] = score[1] = score[2] = score[3] = score[4] = 0;
        Intent intent = new Intent(this, Q1.class);
        finishAffinity();
        startActivity(intent);
    }
}
