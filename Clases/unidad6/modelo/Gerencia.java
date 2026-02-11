package espol.poo.modelo;

import java.util.ArrayList;

public class Gerencia {
    private String nombre;
    private ArrayList<Departamento> departamentos;

    public Gerencia(String nombre, ArrayList<Departamento> departamentos) {
        this.nombre = nombre;
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
}
