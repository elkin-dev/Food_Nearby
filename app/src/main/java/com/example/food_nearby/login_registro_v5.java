package com.example.food_nearby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_registro_v5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_registro_v5);
    }

    public void btn_tieneCuenta(View view) {
        Intent btn_tieneCuenta = new Intent(this, login_registro_v6.class);
        startActivity(btn_tieneCuenta);
    }

    public void regresar(View view) {
        onBackPressed();
    }
}