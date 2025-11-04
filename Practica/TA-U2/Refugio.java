import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Refugio{
  private ArrayList<Mascota> lstMascotas;
  private ArrayList<Persona> lstDuenos;

  //constructor crea las listas
  public Refugio(){
    lstMascotas = new ArrayList<>();
    lstDuenos = new ArrayList<>();

    lstMascotas.add(new Mascota("Puka",3));
    lstMascotas.add(new Mascota("Pelusa",2));
    lstMascotas.add(new Mascota("Blacky",1));
    lstMascotas.add(new Mascota("Marley",1));

    //agrego a dos personas cada uno con una mascota
    lstDuenos.add(new Persona("123","Karla"));
    lstDuenos.get(0).adoptar(new Mascota("Toto",4));
    lstDuenos.add(new Persona("124","Luis"));
    lstDuenos.get(1).adoptar(new Mascota("Nala",2));
    
  }
//crear el método buscarMascota
  
//método que elimina a una mascota de la lista
  //revise este método e investiga sobre Iterator
  
  public void eliminarMascota(Mascota m){
    Iterator<Mascota> it = lstMascotas.iterator();
    int i =0;
    while(it.hasNext()){
      Mascota m1 = (Mascota) it.next();
      if (m.getNombre().equals(m1.getNombre())){
        it.remove();
      }
      i++;
    }


  }
  
  public static void main(String[] args){
    //objeto para tener acceso a las listas y métodos que están definidas en esta clase
    Refugio r = new Refugio();
    //complete este metodo para simular UNA adopcion
    Scanner sc = new Scanner(System.in);
    
    sc.close();
  }
  
}