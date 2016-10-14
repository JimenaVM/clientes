package com.tutorialsbuzz.tablayoutdemo.TabFragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

import com.tutorialsbuzz.tablayoutdemo.MainActivity;
import com.tutorialsbuzz.tablayoutdemo.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}