package com.co.ecoconexion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.bumptech.glide.GenericTransitionOptions;
import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Aplica animación a la imagen del logo
       ImageView ivLogo = findViewById(R.id.ivLogo);
       AnimationSet animationSet = new AnimationSet(true);
       //animationSet.addAnimation(new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f));
       //animationSet.addAnimation(new TranslateAnimation(0, 0, 0, 1000));
        animationSet.addAnimation(new AlphaAnimation(0, 1));
       animationSet.setDuration(3000);
       ivLogo.startAnimation(animationSet);

        new Handler().postDelayed(new Runnable() {
              @Override
              public void run() {
                  Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                  startActivity(intent);
                  finish();
              }
          }, 3000

        );
    }
}