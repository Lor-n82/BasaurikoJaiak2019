package com.example.basaurikojaiak2019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Calendario extends AppCompatActivity {

    private int dia=0;
    private ImageView a,b,c,d, e,f,g,h,i,j;
    private Intent intento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_calendario);

        getSupportActionBar().hide();

        a = findViewById(R.id.imageViewDia11);
        b = findViewById(R.id.imageViewDia12);
        c = findViewById(R.id.imageViewDia13);
        d = findViewById(R.id.imageViewDia14);
        e = findViewById(R.id.imageViewDia15);
        f = findViewById(R.id.imageViewDia16);
        g = findViewById(R.id.imageViewDia17);
        h = findViewById(R.id.imageViewDia18);
        i = findViewById(R.id.imageViewDia19);
        j = findViewById(R.id.imageViewDia20);

        a.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));
        b.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));
        c.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));
        d.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));
        e.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));
        f.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));
        g.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));
        h.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));
        i.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));
        j.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fade_transition_animation));

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
