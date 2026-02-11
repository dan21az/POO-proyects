package espol.poo.appejemplo2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import espol.poo.modelo.Empleado;


public class EmpleadoAdapter extends RecyclerView.Adapter<EmpleadoAdapter.EmpleadoViewHolder> {


    private ArrayList<Empleado> empleados;
    private Context context;
    public EmpleadoAdapter(ArrayList<Empleado> empleados, Context context) {
        this.empleados = empleados;
        this.context = context;
    }

    //Se encarga de "inflar" el archivo XML de la fila y meterlo dentro de un ViewHolder. Este método solo se llama unas pocas veces (hasta llenar la pantalla).
    @Override
    public EmpleadoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_empleado, parent, false);
        return new EmpleadoViewHolder(view);
    }

    //Se llama cada vez que un elemento entra en la pantalla. Aquí es donde asignas el texto, las imágenes o los colores a la vista según su posición.
    @Override
    public void onBindViewHolder(EmpleadoViewHolder holder, int position) {
        Empleado empleado = empleados.get(position);
        holder.nombreTextView.setText(empleado.getNombre());
        holder.departamentoTextView.setText(empleado.getDepartamento().toString());
        //hacer otras acciones relacionadas a este empleado

    }


    @Override
    public int getItemCount() {
        return empleados.size();
    }


    public static class EmpleadoViewHolder extends RecyclerView.ViewHolder {
        TextView nombreTextView;
        TextView departamentoTextView;



        public EmpleadoViewHolder(View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.tvNombre);
            departamentoTextView = itemView.findViewById(R.id.tvDepartamento);

        }
    }
}

