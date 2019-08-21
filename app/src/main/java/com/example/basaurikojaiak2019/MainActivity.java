package com.example.basaurikojaiak2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.bartbergmans.gradientbutton.views.GradientButton;

public class MainActivity extends AppCompatActivity {

    private GradientButton botonPrograma, botonCuadrilla;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        botonPrograma = findViewById(R.id.boton1);
        botonCuadrilla = findViewById(R.id.boton2);
    }

    public void onclick(View v){
        GradientButton boton = (GradientButton) v;

        if(boton.getId() == botonPrograma.getId()){
            intent = new Intent(this,Calendario.class);
            startActivity(intent);
        }

        if(boton.getId() == botonCuadrilla.getId()){
            intent = new Intent(this,Cuadrillas.class);
            startActivity(intent);
        }
    }
}
