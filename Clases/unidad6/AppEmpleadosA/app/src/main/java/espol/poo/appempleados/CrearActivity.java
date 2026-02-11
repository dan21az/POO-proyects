package espol.poo.appempleados;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import espol.poo.modelo.Departamento;
import espol.poo.modelo.Empleado;

public class CrearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_editar);//usa la misma actividad de editar
        llenarSpinner();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void llenarSpinner(){
        Spinner sItems = findViewById(R.id.spDepart);


        ArrayList<Departamento> listaDepart =  Departamento.obtenerDepartamentos();

        ArrayAdapter<Departamento> adapter = new ArrayAdapter<Departamento>(
                this, android.R.layout.simple_spinner_item, listaDepart);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sItems.setAdapter(adapter);
    }

    //método llamado al dar click en botón Cerrar
    public void cerrar(View view){
        finish();
    }

    public void guardar(View view){
        //recolectar los datos del formulario
        Spinner sItems = findViewById(R.id.spDepart);

        Departamento d = (Departamento)sItems.getSelectedItem();
        EditText etNombre = findViewById(R.id.etNombre);//recupera el editText para el nombre de la vista

        //crear el objeto Empleado con los datos recogidos del formulario
        Empleado nuevo = new Empleado(etNombre.getText().toString(),d);


        Log.d("AppEmpleados", nuevo.toString());

        //poner el empleado en la lista y actualizar el archivo

        ArrayList<Empleado> lista = new ArrayList<>();
        try{
            lista =Empleado.cargarEmpleados(this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));

            lista.add(nuevo);
            Log.d("AppEmpleados","Actualizado en lista");
            //guardar la lista en el archivo
            Empleado.guardarLista(this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS),lista);
            Toast.makeText(getApplicationContext(),"Datos guardados", Toast.LENGTH_LONG).show();
        }catch (Exception e){
            Log.d("AppEmpleados", "Error al guardar datos al crear"+e.getMessage());
            //poner en la lista
        }
        finish();
    }
}