package espol.poo.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Departamento implements Serializable {
    private String nombre;
    private String email;

    public Departamento(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "-"+ nombre + "-";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }


    public static ArrayList<Departamento> obtenerDepartamentos(){
        ArrayList<Departamento> listaDepart =  new ArrayList<>();
        listaDepart.add(new Departamento("Ventas", "ventas@empresa.com"));
        listaDepart.add(new Departamento("Contabilidad", "contable@empresa.com"));
        listaDepart.add(new Departamento("Compras", "compras@empresa.com"));
        return listaDepart;
    }
}
