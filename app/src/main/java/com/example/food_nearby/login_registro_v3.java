package com.example.food_nearby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_registro_v3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_registro_v3);
    }

    //MODIFICAR ES PARA PRUEBA esto es para pasar con click en los botones
    //Metodo btn_inscribirse_v3
    public void btn_tieneCuenta(View view) {
        Intent btn_tieneCuenta = new Intent(this, login_registro_v6.class);
        startActivity(btn_tieneCuenta);
    }

    public void regresar(View view) {
        onBackPressed();
    }




    /***
     * Esto hay que ubicarlo hacia menu ojo va despues de logearse
     * */
    public void btn_suscribirse(View view) {
        Intent btn_suscribirse = new Intent(this, barra_opciones_1.class);
        startActivity(btn_suscribirse);
    }
}