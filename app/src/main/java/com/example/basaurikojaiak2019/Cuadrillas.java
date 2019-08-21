package com.example.basaurikojaiak2019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class Cuadrillas extends AppCompatActivity {

    RecyclerView newRecyclerView;
    AdapterCuadrilla cuadrillasAdapter;
    List<ItemCuadrilla> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_cuadrillas);

        getSupportActionBar().hide();

        newRecyclerView = findViewById(R.id.rvCuadrillas);
        mData = new ArrayList<>();

        mData.add(new ItemCuadrilla("Alaiak","Chicos: Camisa blanca, chaleco negro, gerriko verde, pantalón mahón, abarcas.\n\n" +
                "Chicas: Camisa blanca, chaleco negro, falda mahón, delantal negro, abarcas.","Dia11",R.drawable.alaiak));
        mData.add(new ItemCuadrilla("Aldatxa","Chicos: Camisa blanca, chaleco verde, gerriko rojo, pantalón mahón, abarcas.\n\n" +
                "Chicas: Camisa blanca, chaleco verde, falda mahón con rayas roja, verde y blanca, abarcas.","Dia12",R.drawable.aldatxa));
        mData.add(new ItemCuadrilla("Basajaunak","Chicos: Camisa roja, gerriko verde, pantalón blanco.\n\n" +
                "Chicas: Camisa roja, falda negra con dos rayas verdes, delantal verde.","Dia13",R.drawable.basajaunak));
        mData.add(new ItemCuadrilla("Edurre","Chicos: Camisa blanca, chaleco negro, gerriko negro, pantalón azul, abarcas\n" +
                "Chicas: Camisa blanca, chaleco negro, falda azul con detalle negro, abarcas","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Hauspoak","Chicos: Camisa blanca, blusón azul y blanco, gerriko verde, pantalón mahón, abarcas\n" +
                "Chicas: Camisa y falda negra con puntos blancos, delantal negro, abarcas","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Itsaslapurrak","Chicos: Camisa blanca, chaleco rojo, pantalón negro, gerriko verde y abarcas\n" +
                "Chicas: Camisa blanca, chaleco rojo, falda negra con rayas rojas, abarcas","Dia12",R.drawable.d11));
        mData.add(new ItemCuadrilla("Laguntasuna","Chicos: Camisa blanca, blusón azul y blanco, gerriko verde, pantalón mahón, abarcas\n" +
                "Chicas: Camisa y falda negra con puntos blancos, delantal negro, abarcas","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Mozkorrak","Chicos: Camisa blanca, chaleco rojo, pantalón negro, gerriko verde y abarcas\n" +
                "Chicas: Camisa blanca, chaleco rojo, falda negra con rayas rojas, abarcas","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Ogeta Bat","Chicos: Camisa blanca, blusón rojo, gerriko verde, pantalón mahón, abarcas\n" +
                "Chicas: Camisa blanca, chaleco verde, delantal rojo, falda mahón, abarcas","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Ontzak","Chicos: Camisa y pantalón mahón, gerriko negro, pañuelo cuadros azul y blanco, abarcas\n" +
                "Chicas: Camisa y falda mahón, delantal rojo y blanco, pañuelo cuadros azul y blanco, abarcas","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Txano Gorritxu","Chicos: Camisa blanca, blusón negro, gerriko negro, pantalón mahón, abarcas\n" +
                "Chicas: Camisa y falda negra, delantal gris y blanco, abarcas","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Txikerrak","Chicos: Camisa y pantalón blanco, gerriko verde\n" +
                "Chicas: Camisa blanca, chaleco negro, falda verde con rayas negras, delantal negro","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Urbiko Lagunak","Chicos: Camisa blanca, blusón rojo y blanco, gerriko negro, pantalón mahón, abarcas\n" +
                "Chicas: Camisa y falda roja y blanca, delantal negro, abarcas","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Zigorrak","Chicos: Camisa blanca, blusón gris y blanco, gerriko verde, pantalón mahón, abarcas\n" +
                "Chicas: Camisa y falda gris y blanca, delantal negro, abarcas","Dia13",R.drawable.d13));
        mData.add(new ItemCuadrilla("Zoroak","Chicos: Camisa blanca, blusón verde y blanco, gerriko verde, pantalón mahón, abarcas\n" +
                "Chicas: Camisa blanca, chaleco y falda mahón, delantal verde y blanco, abarcas","Dia13",R.drawable.d13));

        cuadrillasAdapter = new AdapterCuadrilla(this,mData);
        newRecyclerView.setAdapter(cuadrillasAdapter);
        newRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
