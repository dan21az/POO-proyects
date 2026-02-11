package espol.poo;
import java.util.ArrayList;   
import java.util.Collections;
import java.util.Iterator;

import espol.poo.interfaces.Juego;
import espol.poo.modelo.*;
class Main {
  public static void main(String[] args) {
      //probar cada uno de los juegos
       crearListaOrdenada();
        Juego.test();
        JuegoDeDados juego1 = new JuegoDeDados();
        System.out.println(juego1.variable);
        System.out.println(Juego.variable);
        //Juego.variable;
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();
        juego1.prueba();

        JuegoAdivinaNumero juego2 = new JuegoAdivinaNumero();
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
        //probar ordenamiento de lista
       





  }

  public static void crearListaOrdenada(){
    //crear la lista y agregar elementos
    ArrayList<Persona> lista = new ArrayList<>();
    lista.add(new Persona("Gladys","Carrillo"));
    lista.add(new Persona("Diego","Aguirre"));
    lista.add(new Persona("Luis","Lopez"));
    lista.add(new Persona("Daniel","Lopez"));

    System.out.println(lista);//mostrar la lista
    //ordenar la lista
    Collections.sort(lista);
    System.out.println(lista);//mostrar la lista

    //ordenamiento alternativo usando comparator
    Collections.sort(lista,new OrdenNombre());
    System.out.println(lista);//mostrar la lista

    //eliminar todos los objetos con nombre Gladys

    System.out.println("Lista antes:"+lista);
    //iterar con iterator
    Iterator<Persona> it = lista.iterator();
    //puedo eliminar mientras itero
    while (it.hasNext()){
      Persona p = it.next();
      if (p.getNombre().equals("Gladys")){
        it.remove();
      }
    }
    System.out.println("Lista después:"+lista);
  }
}