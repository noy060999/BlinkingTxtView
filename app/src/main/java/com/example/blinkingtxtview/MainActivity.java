package com.example.blinkingtxtview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myblinkingtxt.MyBlinkingTxt;

public class MainActivity extends AppCompatActivity {

    MyBlinkingTxt textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}