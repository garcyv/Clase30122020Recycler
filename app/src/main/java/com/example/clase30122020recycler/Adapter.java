package com.example.clase30122020recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolderdatos> {
    ArrayList<String> listDatos;

    public Adapter(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @Override
    public ViewHolderdatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.worditem_list,null,false);

        return new ViewHolderdatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderdatos holder, int position) {
        holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderdatos extends RecyclerView.ViewHolder {

        TextView dato;
        public ViewHolderdatos(View itemView) {
            super(itemView);
            dato = (TextView) itemView.findViewById(R.id.textView);

        }

        public void asignarDatos(String datos) {
            dato.setText(datos);
        }
    }
}
