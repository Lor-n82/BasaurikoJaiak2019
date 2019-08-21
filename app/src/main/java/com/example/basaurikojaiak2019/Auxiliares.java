package com.example.basaurikojaiak2019;

import android.content.Context;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Calendar;

public class Auxiliares {

    public void modo(ConstraintLayout v, Calendar c, Context t){
        int hora = c.get(Calendar.HOUR_OF_DAY);

        if(hora>21 || hora<8){
            v.setBackgroundColor(t.getResources().getColor(R.color.black));
        }else {
            v.setBackgroundColor(t.getResources().getColor(R.color.white));
        }
    }

}
