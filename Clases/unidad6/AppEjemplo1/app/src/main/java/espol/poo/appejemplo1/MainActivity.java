package espol.poo.appejemplo1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import espol.poo.appejemplo1.modelo.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        crearDatosIniciales();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    private void crearDatosIniciales() {
        boolean guardado = false;
        File directorio = this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        try{
            guardado = Empleado.crearDatosIniciales(directorio);

        }catch (Exception e){
            guardado = false;
            Log.d("AppEjemplo1", "Error al crear los datos iniciales"+e.getMessage());
        }
        if (guardado) {
            Log.d("AppEjemplo1", "DATOS INICIALES GUARDADOS");
            //LEER LOS DATOS
        }
    }
    public void guardar(View view) {
        //recolectar los datos del formulario

        EditText etNombre = findViewById(R.id.etNombre);//recupera el editText para el nombre de la vista
        EditText etCedula = findViewById(R.id.etCedula);

        String nombre = etNombre.getText().toString();
        String cedula = etCedula.getText().toString();

        //escribo en el log

        Log.d("AppEjemplo1", "datos:" + nombre + " "+ cedula);
        //escribo en el archivo
        File directorio = this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);



        boolean guardado = false;
        try{
            guardado = Empleado.guardarEmpleado(nombre,cedula,directorio);
            //limpiar las cajas de texto
            etNombre.setText("");
            etCedula.setText("");
        }catch (Exception e){
            guardado = false;
            Log.d("AppEjemplo1", "Error al guardar"+e.getMessage());
            Toast.makeText(getApplicationContext(),"Error al guardar", Toast.LENGTH_LONG).show();

        }

        if (guardado) {
            Toast.makeText(getApplicationContext(),"Datos guardados", Toast.LENGTH_LONG).show();
            Log.d("AppEjemplo1", "DATOS GUARDADOS");
            //LEER LOS DATOS
        }


    }
}