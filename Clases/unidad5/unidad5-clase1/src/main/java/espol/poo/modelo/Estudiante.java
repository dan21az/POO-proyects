/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.modelo;



/**
 *
 * @author Gladys
 */
public class Estudiante  {
    
    private String id;
    private String nombre;
    private Direccion direccion;
    private transient String password;



    public Estudiante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        password = "12345";
    }
    public Estudiante(String id, String nombre, String clave) {
        this.id = id;
        this.nombre = nombre;
        password = clave;
    }
    

    public Estudiante(String id, String nombre, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        password = "12345";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    
    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ",password" + password+ '}';
    }
   


}
