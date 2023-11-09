package com.co.ecoconexion;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.GenericTransitionOptions;
import com.bumptech.glide.Glide;
import jp.wasabeef.glide.transformations.BlurTransformation;



public class MainActivity extends AppCompatActivity  {

    @RequiresApi(api = Build.VERSION_CODES.S)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        ImageView image = findViewById(R.id.rectangle_2);

        // Aplicar desenfoque utilizando Glide Transformations
        Glide.with(this)
                .asBitmap()
                .load(R.drawable.img_bg5)
                .transition(new GenericTransitionOptions<>().transition(android.R.anim.fade_in))
                .transform(new BlurTransformation(13, 13))
                .into(image);
    }

    public void crearNuevaCuenta(View view) {
        Intent intent = new Intent(this, CrearCuenta.class);
        startActivity(intent);
    }

}
