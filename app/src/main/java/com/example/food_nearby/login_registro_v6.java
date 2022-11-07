package com.example.food_nearby;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_registro_v6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_registro_v6);
    }

    public void btn_facebook(View view) {
        Intent btn_facebook = new Intent(this, login_registro_v3.class);
        startActivity(btn_facebook);
    }

    public void btn_twitter(View view) {
        Intent btn_twitter = new Intent(this, login_registro_v4.class);
        startActivity(btn_twitter);
    }

    public void regresar(View view) {
        onBackPressed();
    }

    public void btn_email(View view) {
        Intent btn_email = new Intent(this, login_registro_v5.class);
        startActivity(btn_email);
    }
}