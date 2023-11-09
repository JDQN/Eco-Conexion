package com.co.ecoconexion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;


import com.bumptech.glide.GenericTransitionOptions;
import com.bumptech.glide.Glide;


import jp.wasabeef.glide.transformations.BlurTransformation;;

public class CrearCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }
}
