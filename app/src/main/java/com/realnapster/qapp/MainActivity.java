package com.realnapster.qapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.realnapster.qapp.simple.SimpQ;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bsimple,btough,bcother,brate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bsimple=(Button) findViewById(R.id.bsq);
        btough=(Button) findViewById(R.id.btq);
        bcother=(Button) findViewById(R.id.bcapp);
        brate=(Button) findViewById(R.id.rapp);
        bsimple.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bsq:
                Intent i=new Intent(MainActivity.this,SimpQ.class);
                startActivity(i);
                break;
            case R.id.btq:
                break;
            case R.id.bcapp:
                break;
            case R.id.rapp:
                break;
        }
    }
}
