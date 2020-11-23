package com.example.myblinkingtxt;

import android.os.Handler;
import android.view.View;

public class MyLogic {
    public static void blink(MyBlinkingTxt textView){
        final Handler handler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int timeToBlink = textView.getBlinkingRate();
                try{Thread.sleep(timeToBlink);}catch (Exception e) {}
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        //blink effect
                        if(textView.getVisibility() == View.VISIBLE){
                            textView.setVisibility(View.INVISIBLE);
                        }else{
                            textView.setVisibility(View.VISIBLE);
                        }
                        blink(textView);
                    }
                });
            }
        }).start();
    }
}
