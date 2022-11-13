package com.example.food_nearby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class login_registro_v2 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_registro_v3);
    }


    //Metodo para btn_facebook_v2
    public void btn_facebook(View view) {
        Intent btn_facebook = new Intent(this, login_registro_v3.class);
        startActivity(btn_facebook);
    }

    public void btn_twitter(View view) {
        Intent btn_twitter = new Intent(this, login_registro_v4.class);
        startActivity(btn_twitter);
    }

    public void btn_email(View view) {
        Intent btn_email = new Intent(this, login_registro_v5.class);
        startActivity(btn_email);
    }

    public void Cerrar(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void btn_tieneCuenta(View view) {
        Intent btn_tieneCuenta = new Intent(this, login_registro_v6.class);
        startActivity(btn_tieneCuenta);
    }

    public void regresar(View view) {
        // Intent regresar = new Intent(this, login_registro_v2.class);
        onBackPressed();
    }
}
