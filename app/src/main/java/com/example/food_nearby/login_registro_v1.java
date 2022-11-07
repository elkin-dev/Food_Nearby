package com.example.food_nearby;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class login_registro_v1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_registro_v1);

        //Con este metodo cargo la pantalla inicial
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(login_registro_v1.this, login_registro_v2.class);
                startActivity(intent);
                finish();
            }
        }, 1000);


    }
}

