package com.totcy.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.totcy.animationtextview.AnimationTextView;

public class MainActivity extends AppCompatActivity {

    AnimationTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (AnimationTextView) findViewById(R.id.tv_test);
        textView.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setMaxNum(4000);
            }
        }, 1000);
    }
}
