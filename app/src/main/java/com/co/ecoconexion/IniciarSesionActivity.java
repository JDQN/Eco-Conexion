package com.co.ecoconexion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IniciarSesionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

    public void crearNuevaCuenta(View view) {
        Intent intent = new Intent(this, CrearCuentaActivity.class);
        startActivity(intent);
    }

    public void tablero(View view) {
        Intent intent = new Intent(this, TableroActivity.class);
        startActivity(intent);
    }
}