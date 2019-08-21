package com.example.basaurikojaiak2019;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa extends AppCompatActivity {

    private int dia = 0;
    RecyclerView newRecyclerView;
    Adapter itemsAdapter;
    List<Item> mData;

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_programa);

        getSupportActionBar().hide();

        dia = getIntent().getIntExtra("dia",0);
        Log.d("AAA",String.valueOf(dia));

        newRecyclerView = findViewById(R.id.rv);
        mData = new ArrayList<>();

        mData.add(new Item("prueba","tomalodaselo","Dia11",R.drawable.d11));
        mData.add(new Item("prueba2","tomalodaselo","Dia12",R.drawable.d12));
        mData.add(new Item("prueba3","tomalodaselo","Dia13",R.drawable.d13));
        mData.add(new Item("prueba4","tomalodaselo","Dia14",R.drawable.d14));
        mData.add(new Item("prueba4","tomalodaselo","Dia14",R.drawable.d14));
        mData.add(new Item("prueba4","tomalodaselo","Dia14",R.drawable.d14));
        mData.add(new Item("prueba4","tomalodaselo","Dia14",R.drawable.d14));
        mData.add(new Item("prueba4","tomalodaselo","Dia14",R.drawable.d14));

        itemsAdapter = new Adapter(this,mData);
        newRecyclerView.setAdapter(itemsAdapter);
        newRecyclerView.setLayoutManager(new LinearLayoutManager(this));



    }



}
