package com.example.donacion;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.donacion.modelo.Causa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CausaAdapter causaAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        cargarDatos();
        //llenar el recyclerView
        llenarLista();
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
        ArrayList<Causa> listaCausa = new ArrayList<>();
        try{
            listaCausa =Causa.getCausas();
            Log.d("AppDonacion","Datos leidos desde el archivo");
        }catch (Exception e){
            listaCausa = Causa.getCausas();
            Log.d("appDonacion", "Error al cargar datos"+e.getMessage());
        }


        Log.d("AppDonacion", listaCausa.toString());//muestra la lista en el log


        causaAdapter = new CausaAdapter(listaCausa,this);
        recyclerView.setAdapter(causaAdapter);
    }


    private void cargarDatos() {
        boolean guardado = false;
        try{
            Causa.getCausas();

        }catch (Exception e){
            guardado = false;
            Log.d("AppDonacion", "Error al crear los datos iniciales"+e.getMessage());
        }
        if (guardado) {
            Log.d("AppDonacion", "DATOS INICIALES GUARDADOS");
            //LEER LOS DATOS
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        llenarLista();
        Log.d("AppDonacion", "En onResume");//muestra la lista en el log


    }
}
