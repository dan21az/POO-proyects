package espol.poo.appejemplo2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import espol.poo.modelo.Empleado;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EmpleadoAdapter empleadoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        cargarDatos();//cargo los datos que se van a visualizar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    private void llenarLista() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Configurar el adaptador
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try{
            listaEmpleados =Empleado.cargarEmpleados(this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
            Log.d("AppEjemplo2","Datos leidos desde el archivo");
        }catch (Exception e){
            listaEmpleados= Empleado.obtenerEmpleados();
            Log.d("AppEjemplo2", "Error al cargar datos"+e.getMessage());
        }

        Log.d("AppEjemplo2", listaEmpleados.toString());//muestra la lista en el log
        // el adapter actúa como un intermediario o "puente" entre tus datos
        // y la interfaz de usuario.
        empleadoAdapter = new EmpleadoAdapter(listaEmpleados,this);
        recyclerView.setAdapter(empleadoAdapter);
    }

    private void cargarDatos() {
        boolean guardado = false;
        try{
            guardado = Empleado.crearDatosIniciales(this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));

        }catch (Exception e){
            guardado = false;
            Log.d("AppEjemplo2", "Error al crear los datos iniciales"+e.getMessage());
        }
        if (guardado) {
            Log.d("AppEjemplo2", "DATOS INICIALES GUARDADOS");
            //LEER LOS DATOS
        }
    }
    //este metodo se ejecuta cada vez que la actividad pasa al primer plano
    @Override
    public void onResume() {
        super.onResume();
        llenarLista();
        Log.d("AppEjemplo2", "En onResume");//muestra la lista en el log

    }


}