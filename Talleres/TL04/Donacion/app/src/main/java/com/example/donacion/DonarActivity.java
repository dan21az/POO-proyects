package com.example.donacion;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.donacion.modelo.Causa;
import com.example.donacion.modelo.Donacion;

public class DonarActivity extends AppCompatActivity {

    Causa causa;
    Button btnGuardar;

    Donacion dona;
    EditText etNombre, etCantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_donar);
        btnGuardar = findViewById(R.id.btnGuardar);
        etNombre = findViewById(R.id.etNombre);
        etCantidad = findViewById(R.id.etCantidad);
        mostrarDatos();
        guardar();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    private void mostrarDatos() {
        Intent i = getIntent();
        //recupera objeto enviado desde la otra actividad
        causa = (Causa) i.getSerializableExtra("CAUSA");
        TextView etCausa = findViewById(R.id.tvCausa);
        etCausa.setText(causa.getNombre());

    }

    private void crearDonacion(){
        ;
        String nombre = etNombre.getText().toString();

        String cantidad = etCantidad.getText().toString().trim();

        try {
            int monto = Integer.parseInt(cantidad);
            dona = new Donacion(nombre, monto);
            causa.agregarDonacion(dona);
            Log.d("AppDonacion","Nombre: "+dona.getDonador() +" Valor: "+dona.getMonto());
        } catch (NumberFormatException e){
            etCantidad.setError("Ingrese un número");

        } catch (Exception e){

        }
        etCantidad.setText("");
        etNombre.setText("");
    }

    private void guardar(){

        btnGuardar.setOnClickListener(v -> {
            crearDonacion();
            finish();
        });

    }
}