package espol.poo.modelo;
public class Persona implements Comparable<Persona> {

  String nombre;
  String apellido;

  public Persona(String nombre, String apellido){
	  this.nombre = nombre;
	  this.apellido = apellido;

  }
	
  public String getNombre(){
    return nombre;
  }
  public String toString(){
    return apellido + " " + nombre;
  }
  
  @Override

  public int compareTo(Persona p){
    
    //int r = this.apellido.compareTo(p.apellido);
    int r = p.apellido.compareTo(this.apellido);
     //ordenar por nombre si los apellidos son iguales
   // if (r==0) return p.nombre.compareTo(this.nombre);
   // else return r;
  // return r == 0 ? this.nombre.compareTo(p.nombre) : r;
   return r == 0 ? p.nombre.compareTo(this.nombre) : r;
  }

}