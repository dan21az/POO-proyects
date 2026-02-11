package espol.poo.modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Empleado implements Serializable {
    private String nombre;
    private Departamento departamento;

    public Empleado(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }



    //devuelve una lista simple de empleados
    public static ArrayList<Empleado> obtenerEmpleados(){
        ArrayList<Empleado> lista = new ArrayList<>();

        lista.add(new Empleado("Luis Torres",new Departamento("Ventas", "ventas@etp.com")));
        lista.add(new Empleado("Sofia Castro",new Departamento("Contabilidad", "contable@etp.com")));
        lista.add(new Empleado("Marcos Valle",new Departamento("Ventas", "ventas@etp.com")));
        return lista;
    }
    @Override
    public String toString() {
        return  nombre +  " - " + departamento + "-";
    }
}
