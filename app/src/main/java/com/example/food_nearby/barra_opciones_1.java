package com.example.food_nearby;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.widget.Toast;

public class barra_opciones_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barra_opciones_1);
    }

    public void btn_suscribirse(View view) {
        Intent btn_suscribirse = new Intent(this, barra_opciones_1.class);
        startActivity(btn_suscribirse);
    }

    //Metodo para mostrar y ocultar menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //Metodo para asignar las funciones correspondientes a las opciones
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item2) {
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item3) {
            Toast.makeText(this, "Notificaciones", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item4) {
            Toast.makeText(this, "Mis compras", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item5) {
            Toast.makeText(this, "Favoritos", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item6) {
            Toast.makeText(this, "Ofertas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item7) {
            Toast.makeText(this, "Historial", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item8) {
            Toast.makeText(this, "Ayuda", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item9) {
            Toast.makeText(this, "Mercado", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item10) {
            Toast.makeText(this, "Categorías", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item11) {
            Toast.makeText(this, "Cerrar sesión", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


}