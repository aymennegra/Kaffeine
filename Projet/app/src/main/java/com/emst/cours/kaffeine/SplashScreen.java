package com.emst.cours.kaffeine;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

//import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private static final int XBREE_APP = 4000;
    ImageView imageView;
    Animation top, bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        imageView = findViewById(R.id.imageView);


        top = AnimationUtils.loadAnimation(this, R.anim.top);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);
        imageView.setAnimation(top);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(com.emst.cours.kaffeine.SplashScreen.this, com.emst.cours.kaffeine.MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, XBREE_APP);
    }
}