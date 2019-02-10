package com.example.goilor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View vista){
        Button boton = (Button) vista;

        if(boton.getId() == R.id.btn_Inicio){
            Intent intento = new Intent(this,Pantalla2.class);
            startActivity(intento);
        }
    }




}
