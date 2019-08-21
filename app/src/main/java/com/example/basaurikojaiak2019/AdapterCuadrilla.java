package com.example.basaurikojaiak2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Calendar;
import java.util.List;

public class AdapterCuadrilla extends RecyclerView.Adapter<AdapterCuadrilla.CuadrillaViewHolder> {

    Context mContext;
    List<ItemCuadrilla> mData;

    public AdapterCuadrilla(Context mContext, List<ItemCuadrilla> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CuadrillaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.itemcuadrilla, parent, false);
        return new AdapterCuadrilla.CuadrillaViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCuadrilla.CuadrillaViewHolder holder, int position) {

        holder.foto.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_transition_animation));

        holder.clCua.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_scale_animation));

        holder.titulo.setText(mData.get(position).getNombreCuadrilla());
        holder.descripcion.setText(mData.get(position).getDescripcion());
        holder.fecha.setText(mData.get(position).getFecha());
        holder.foto.setImageResource(mData.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class CuadrillaViewHolder extends RecyclerView.ViewHolder {

        TextView titulo, descripcion, fecha;
        ImageView foto;
        ConstraintLayout clCua;
        ConstraintLayout clCuaRoot;

        Calendar ca1 = Calendar.getInstance();
        Auxiliares a = new Auxiliares();

        public CuadrillaViewHolder(@NonNull View itemView) {
            super(itemView);

            //ENLACE DE VISTAS
            clCua = itemView.findViewById(R.id.clCua);
            clCuaRoot = itemView.findViewById(R.id.cuadrillasroot);
            titulo = itemView.findViewById(R.id.titlecuadrilla);
            descripcion = itemView.findViewById(R.id.descripcioncuadrilla);
            fecha = itemView.findViewById(R.id.fechacuadrilla);
            foto = itemView.findViewById(R.id.image_cuadrilla);

                //MODO CLARO / OSCURO
                a.modo(clCua, ca1, mContext);

        }
    }
}
