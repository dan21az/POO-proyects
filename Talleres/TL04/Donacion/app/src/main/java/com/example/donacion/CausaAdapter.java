package com.example.donacion;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.donacion.modelo.Causa;

import java.util.ArrayList;

public class CausaAdapter extends RecyclerView.Adapter<CausaAdapter.CausaViewHolder> {


    private ArrayList<Causa> causas;
    private Context context;
    public CausaAdapter(ArrayList<Causa> causa, Context context) {
        this.causas = causa;
        this.context = context;
    }


    @Override
    public CausaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_causa, parent, false);
        return new CausaViewHolder(view);
    }


    @Override
    public void onBindViewHolder(CausaViewHolder holder, int position) {
        Causa causa = causas.get(position);
        holder.nombreTextView.setText(causa.getNombre());
        holder.donacionesTextView.setText(String.valueOf(causa.calcularTotal()));

        holder.donarButton.setOnClickListener(v -> {

            Intent intent = new Intent(context, DonarActivity.class);
            intent.putExtra("CAUSA", causa);

            context.startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return causas.size();
    }


    public static class CausaViewHolder extends RecyclerView.ViewHolder {
        TextView nombreTextView;
        TextView donacionesTextView;
        Button donarButton;


        public CausaViewHolder(View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.tvNombre);
            donacionesTextView = itemView.findViewById(R.id.tvtotal_donaciones);
            donarButton = itemView.findViewById(R.id.btnDonar);
        }
    }
}

