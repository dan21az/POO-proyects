package espol.poo.appempleados;
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
import espol.poo.modelo.*;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EmpleadoAdapter empleadoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        cargarDatos();


        Log.d("AppEmpleados","en onCreate");
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
            Log.d("AppEmpleados","Datos leidos desde el archivo");
        }catch (Exception e){
            listaEmpleados= Empleado.obtenerEmpleados();
            Log.d("AppEmpleados", "Error al cargar datos"+e.getMessage());
        }

        Log.d("AppEmpleados", listaEmpleados.toString());//muestra la lista en el log

        empleadoAdapter = new EmpleadoAdapter(listaEmpleados,this);
        recyclerView.setAdapter(empleadoAdapter);
    }

    private void cargarDatos() {
        boolean guardado = false;
        try{
            guardado = Empleado.crearDatosIniciales(this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));

        }catch (Exception e){
            guardado = false;
            Log.d("AppEmpleados", "Error al crear los datos iniciales"+e.getMessage());
        }
        if (guardado) {
            Log.d("AppEmpleados", "DATOS INICIALES GUARDADOS");
            //LEER LOS DATOS
        }
    }

    //se llama al dar click en Crear
    public void crearEmpleado(View view){
        Intent intent = new Intent(this, CrearActivity.class);
        Log.d("App","Al dar click en crear empleado");
        this.startActivity(intent);
    }

    //este metodo se ejecuta cada vez que la actividad pasa al primer plano
    @Override
    public void onResume() {
        super.onResume();
        llenarLista();
        Log.d("AppEmpleados", "En onResume");//muestra la lista en el log

    }

}