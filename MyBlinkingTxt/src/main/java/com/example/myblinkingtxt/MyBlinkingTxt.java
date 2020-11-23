package com.example.myblinkingtxt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class MyBlinkingTxt extends TextView{

    private int blinkingRate; //in milliseconds

    public MyBlinkingTxt(Context context) {
        super(context);
        init(context); //init without any attributes
    }

    public MyBlinkingTxt(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initBlinkAttr(context, attrs);
    }

    public MyBlinkingTxt(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initBlinkAttr(context, attrs);
    }

    public MyBlinkingTxt(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initBlinkAttr(context, attrs);
    }

    //get the blinking rate from attrs.xml
    private void initBlinkAttr(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.MyBlinkingTxt, 0, 0);
        try {
            blinkingRate = ta.getInt(R.styleable.MyBlinkingTxt_blinkingRate, 0);
        } finally {
            ta.recycle();
        }
        doBlink(context);
    }

    private void init(Context context) {
        doBlink(context);
    }

    private void doBlink(Context context) {
        MyLogic.blink(this);
    }

    public int getBlinkingRate() {
        return blinkingRate;
    }
}

