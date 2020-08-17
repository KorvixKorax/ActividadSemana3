package com.example.mascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class perfiladaptador extends RecyclerView.Adapter<perfiladaptador.perfilViewHolder>{

    ArrayList<perfiles> perfiles;

    public perfiladaptador (ArrayList<perfiles> perfiles){
        this.perfiles = perfiles;
    }


    @Override
    public perfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);

        return new perfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(perfilViewHolder holder, int position) {
        perfiles perfil = perfiles.get(position);
        holder.imgMascota.setImageResource(perfil.getFoto());
        holder.nombreMascota.setText(perfil.getNombre());


    }

    @Override
    public int getItemCount() {
        return perfiles.size();
    }

    public static class perfilViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgMascota;
        private TextView nombreMascota;

        public perfilViewHolder(View itemView) {
            super(itemView);

            imgMascota = itemView.findViewById(R.id.imgMascota);
            nombreMascota = itemView.findViewById(R.id.nombreMascota);
        }
    }
}
