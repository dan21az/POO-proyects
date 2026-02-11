package espol.poo.appempleados;



import android.content.Context;
import android.content.Intent;
import android.util.Log;
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


    @Override
    public EmpleadoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_empleado, parent, false);
        return new EmpleadoViewHolder(view);
    }


    @Override
    public void onBindViewHolder(EmpleadoViewHolder holder, int position) {
        Empleado empleado = empleados.get(position);
        holder.nombreTextView.setText(empleado.getNombre());
        holder.departamentoTextView.setText(empleado.getDepartamento().toString());
        // Configuramos el botón de Editar
        //setOnClickListener() espera un objeto que implemente la interfaz View.OnClickListener

        //con clase anonima

        holder.editarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EditarActivity.class);
                intent.putExtra("empleado", empleado);
                Log.d("App","Al dar click en editar clase anonima");


                context.startActivity(intent);
            }
        });
        /*
        //con expresión lambda
        holder.editarButton.setOnClickListener(v -> {
            // Iniciamos la nueva actividad, pasando información sobre el empleado
            Intent intent = new Intent(context, EditarActivity.class);
            intent.putExtra("empleado", empleado);

            Log.d("App","Al dar click en editar");
            context.startActivity(intent);
        });*/

    }


    @Override
    public int getItemCount() {
        return empleados.size();
    }


    public static class EmpleadoViewHolder extends RecyclerView.ViewHolder {
        TextView nombreTextView;
        TextView departamentoTextView;
        Button editarButton;


        public EmpleadoViewHolder(View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.tvNombre);
            departamentoTextView = itemView.findViewById(R.id.tvDepartamento);
            editarButton = itemView.findViewById(R.id.btnEditar);
        }
    }
}

