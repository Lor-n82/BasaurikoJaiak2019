package com.example.basaurikojaiak2019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Calendario extends AppCompatActivity {

    private int dia=0;
    private Intent intento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_calendario);

        getSupportActionBar().hide();
        
    }

    public void onClick(View v){
        ImageView imagen = (ImageView) v;


        if(imagen.getId() == R.id.imageViewDia11){
            dia=11;
        }else if(imagen.getId() == R.id.imageViewDia12){
            dia=12;
        }else if(imagen.getId() == R.id.imageViewDia13){
            dia=13;
        }else if(imagen.getId() == R.id.imageViewDia14){
            dia=14;
        }else if(imagen.getId() == R.id.imageViewDia15){
            dia=15;
        }else if(imagen.getId() == R.id.imageViewDia16){
            dia=16;
        }else if(imagen.getId() == R.id.imageViewDia17){
            dia=17;
        }else if(imagen.getId() == R.id.imageViewDia18){
            dia=18;
        }else if(imagen.getId() == R.id.imageViewDia19){
            dia=19;
        }else if(imagen.getId() == R.id.imageViewDia20){
            dia=20;
        }

        intento = new Intent(this, Programa.class);
        intento.putExtra("dia",dia);
        startActivity(intento);
    }

}
