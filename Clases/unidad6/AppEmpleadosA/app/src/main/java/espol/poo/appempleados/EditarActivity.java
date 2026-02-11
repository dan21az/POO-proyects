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

public class EditarActivity extends AppCompatActivity {
    Empleado empleado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_editar);
        mostrarDatos();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void mostrarDatos() {
        Intent i = getIntent();
        //recupera objeto enviado desde la otra actividad
        empleado = (Empleado)i.getSerializableExtra("empleado");
        //Log.d("AppEmpleados", "Objeto recuperado");
        //Log.d("AppEmpleados", empleado.toString());

        EditText etNombre = findViewById(R.id.etNombre);//recupera el editText para el nombre de la vista
        etNombre.setText(empleado.getNombre());

        Spinner sItems = findViewById(R.id.spDepart);


        ArrayList<Departamento> listaDepart =  Departamento.obtenerDepartamentos();

        ArrayAdapter<Departamento> adapter = new ArrayAdapter<Departamento>(
                this, android.R.layout.simple_spinner_item, listaDepart);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sItems.setAdapter(adapter);
        //establecer el elemento seleccionado
        int spinnerPosition = adapter.getPosition(empleado.getDepartamento());
        sItems.setSelection(spinnerPosition);




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
        empleado.setNombre(etNombre.getText().toString());
        empleado.setDepartamento(d);
        Log.d("AppEmpleados", empleado.toString());

        //poner el empleado en la lista y actualizar el archivo

        ArrayList<Empleado> lista = new ArrayList<>();
        try{
            lista =Empleado.cargarEmpleados(this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
            int i = lista.indexOf(empleado);
            lista.set(i,empleado);
            Log.d("AppEmpleados","Actualizado en lista");
            //guardar la lista en el archivo
            Empleado.guardarLista(this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS),lista);
            Toast.makeText(getApplicationContext(),"Datos guardados", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Log.d("AppEmpleados", "Error al cargar datos al editar"+e.getMessage());
            //poner en la lista
        }
        finish();
    }
}