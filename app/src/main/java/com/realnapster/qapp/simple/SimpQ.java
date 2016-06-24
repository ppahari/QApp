package com.realnapster.qapp.simple;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.realnapster.qapp.R;

public class SimpQ extends AppCompatActivity implements View.OnClickListener {

    TextView pIndex, tIndex, questions, answers;
    String[] simp_ques, simp_ans;
    Button left, right, center;
    int index;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);
        count=0;
        index = 0;
        //Codes to add custom action bar
        //Initalize LinearLayout
        LinearLayout titlebar_ll=(LinearLayout)findViewById(R.id.ques_titlebar_ll);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.ques_titlebar);
        //Acquiring string arrays from Values ffor questions and answers
        simp_ques = getResources().getStringArray(R.array.ques);
        simp_ans = getResources().getStringArray(R.array.ans);

        //Initalizing text views
        pIndex = (TextView) findViewById(R.id.cTv1);
        tIndex = (TextView) findViewById(R.id.cTv2);
        questions = (TextView) findViewById(R.id.ques);
        answers = (TextView) findViewById(R.id.ans);

        //Initalizing left right and center button
        left = (Button) findViewById(R.id.bleft);
        right = (Button) findViewById(R.id.bright);
        center = (Button) findViewById(R.id.banswer);

        //Setting OnClickListener for Left ,Right and Answer button
        left.setOnClickListener(this);
        center.setOnClickListener(this);
        right.setOnClickListener(this);

        questions.setText(simp_ques[index]);
        answers.setText(getString(R.string.ans));
        pIndex.setText(String.valueOf(index + 1));
        tIndex.setText("/" + String.valueOf(simp_ques.length));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bleft:
                count=0;
               answers.setText((getString(R.string.ans)));
                index--;
                if(index==-1)
                    index=simp_ques.length-1;
                questions.setText(simp_ques[index]);
                pIndex.setText(String.valueOf(index+1));
                break;
            case R.id.bright:
                count=0;
                answers.setText((getString(R.string.ans)));
                index++;
                if(index==simp_ques.length)
                    index=0;
                questions.setText(simp_ques[index]);
                pIndex.setText(String.valueOf(index+1));
                break;
            case R.id.banswer:
                count++;
                if(count%2==0) {
                    answers.setText(getString(R.string.ans));
                }
                else
                    answers.setText(simp_ans[index]);
                break;
        }
    }
}