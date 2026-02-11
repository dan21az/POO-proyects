package com.example.donacion.modelo;

import android.util.Log;

import java.io.Console;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

public class Causa implements Serializable {
    private String nombre;
    private ArrayList<Donacion> donaciones;
    private static ArrayList<Causa> causas;

    public Causa(String nombre) {
        this.nombre = nombre;
        donaciones = new ArrayList<>();
    }
    public Causa(String nombre, ArrayList<Donacion> lista) {
        this.nombre = nombre;
        donaciones = lista;
    }

    public void agregarDonacion(Donacion d){
        donaciones.add(d);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Donacion> getDonaciones() {
        return donaciones;
    }

    public double calcularTotal(){
        double total = 0;
        for (Donacion d: donaciones){

            total += d.getMonto();
        }

        return total;
    }

    public static ArrayList<Causa> getCausas(){
        if (causas==null){
            causas = new ArrayList<>();
            ArrayList<Donacion> ld1 = new ArrayList<>();
            ld1.add(new Donacion("Pedro",50));
            ld1.add(new Donacion("Marcia",25));
            causas.add(new Causa("Casa Josefa", ld1));
            ArrayList<Donacion> ld2 = new ArrayList<>();
            ld2.add(new Donacion("Patricia",45));
            ld2.add(new Donacion("Raul",20));
            causas.add(new Causa("Operación Rufo",ld2));
        }

        return causas;
    }
}
