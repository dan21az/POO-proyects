package com.example.donacion.modelo;
import java.io.Serializable;
public class Donacion implements Serializable{
    private String donador;
    private double monto;

    public Donacion(String donador, double monto) {
        this.donador = donador;
        this.monto = monto;
    }

    public String getDonador() {
        return donador;
    }

    public double getMonto() {
        return monto;
    }

}
