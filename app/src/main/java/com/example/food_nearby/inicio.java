package com.example.food_nearby;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.food_nearby.Fragments.FragmentsAyuda;
import com.example.food_nearby.Fragments.FragmentsCategorias;
import com.example.food_nearby.Fragments.FragmentsCerrarSesion;
import com.example.food_nearby.Fragments.FragmentsHistorial;
import com.example.food_nearby.Fragments.FragmentsInicio;
import com.example.food_nearby.Fragments.FragmentsMisCompras;
import com.example.food_nearby.Fragments.FragmentsNotificaciones;
import com.example.food_nearby.Fragments.FragmentsOfertas;
import com.google.android.material.navigation.NavigationView;

public class inicio extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
//Variables para cargar fragment principal
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);
        //Establecer evento onclick al navigationViev
        navigationView.setNavigationItemSelectedListener(this);


        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        //Cargar fragment principal
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, new FragmentsInicio());
        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        if(item.getItemId() == R.id.item1){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new FragmentsInicio());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.item2){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new FragmentsNotificaciones());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.item3){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new FragmentsMisCompras());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.item4){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new FragmentsOfertas());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.item5){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new FragmentsHistorial());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.item6){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new FragmentsAyuda());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.item7){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new FragmentsCategorias());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.item8){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new FragmentsCerrarSesion());
            fragmentTransaction.commit();
        }
        return false;
    }
}