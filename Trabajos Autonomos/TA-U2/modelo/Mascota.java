package modelo;
public class Mascota{
  private String nombre;
  private int edad;
  private Persona dueno;

  public Mascota(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre(){
    return nombre;
  }

  public int getEdad(){
    return edad;
  }

  public void setDueno(Persona p){
    dueno = p;
    System.out.println(nombre + " ha sido adoptado!, su dueno es: " + p.getNombre());
  }

    public String toString(){
    return nombre + " edad:"+ edad;
  }

}