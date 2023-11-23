package com.co.ecoconexion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.GenericTransitionOptions;
import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class TableroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);

        ImageView image = findViewById(R.id.rectangle);

        // Aplicar desenfoque utilizando Glide Transformations
        Glide.with(this)
                .asBitmap()
                .load(R.drawable.img_bg6)
                .transition(new GenericTransitionOptions<>().transition(android.R.anim.fade_in))
                .transform(new BlurTransformation(13, 13))
                .into(image);
    }
}