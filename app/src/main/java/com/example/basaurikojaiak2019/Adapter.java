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

public class Adapter extends RecyclerView.Adapter<Adapter.ItemViewHolder> {

    Context mContext;
    List<Item> mData;

    public Adapter(Context mContext, List<Item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        return new ItemViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        holder.foto.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_transition_animation));

        holder.clPro.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_transition_animation));

        holder.titulo.setText(mData.get(position).getTitulo());
        holder.descripcion.setText(mData.get(position).getDescripcion());
        holder.fecha.setText(mData.get(position).getFecha());
        holder.foto.setImageResource(mData.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{

        TextView titulo,descripcion,fecha;
        ImageView foto;
        ConstraintLayout clPro, clRoot;

        Calendar ca1 = Calendar.getInstance();
        Auxiliares a = new Auxiliares();

        public ItemViewHolder(@NonNull View itemView){
          super(itemView);

          //ENLACE DE VISTAS
          clPro = itemView.findViewById(R.id.clPro);
          clRoot = itemView.findViewById(R.id.programaroot);
          titulo = itemView.findViewById(R.id.titleprograma);
          descripcion = itemView.findViewById(R.id.descripcionprograma);
          fecha = itemView.findViewById(R.id.fechaprograma);
          foto = itemView.findViewById(R.id.image_programa);

            //MODO CLARO / OSCURO
            a.modo(clPro, ca1, mContext);
        }


    }
}
