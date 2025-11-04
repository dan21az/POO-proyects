package modelo;
import java.util.ArrayList;

public class Persona{
  private String id;
  private String nombre;
  private ArrayList<Mascota> lstMascotas;

  public Persona(String id, String nombre){
    this.id = id;
    this.nombre = nombre;
    lstMascotas = new ArrayList<>();
  }


  public String getNombre(){
    return nombre;
  }



  public String toString(){
    return "ID: " + id +", nombre: " + nombre + ", adopciones: " + lstMascotas.size();
  }


}