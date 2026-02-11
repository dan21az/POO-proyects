package espol.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import espol.poo.polimorfismo1.*;

public class Main {
    public static void main(String[] args) {
        Caballo h1 = new Caballo(4, "blanco");
        Animal h2 = new Caballo(4, "negro");
        Animal h3 = new Animal(4);
   

        h1.eat();
        h2.eat();
        h1.competir();
        //h2.competir();//error porque el metodo solo existe en la clase hija
        Caballo n = (Caballo)h2;
        n.competir();
        // puedo declarar una lista del tipo generico y almacenar tipos especificos
        ArrayList<Animal> lista = new ArrayList<>();
        lista.add(h1);
        lista.add(h2);
        // lista.add(h3);
        lista.add(new Vaca(4, true));
        System.out.println("Llamada de metodos desde lazo");
        for (Animal a : lista) {
         
            a.eat();
        //a.competir();//no puedo llamar a competir porque no esta en animal
            // solo si el animal es una instancia de caballo, se puede hacer casting y
            // llamar a competir
            if (a instanceof Caballo  ) {
                
                //hacer downcasting para llamar al método
                Caballo h4 = (Caballo) a;
                h4.competir();
                // ((Caballo)a).competir();

            }

        }
        System.out.println(lista);
        System.out.println("Eliminar");
         /* 
        //por el uso de los indices quedarán objetos sin examinar
        for (int i = 0; i < lista.size(); i++) {
            Animal a = lista.get(i);
            System.out.println(i+":"+a);
            if (a instanceof Caballo) {
                lista.remove(a);
                //lista.remove(i);
            }
            System.out.println(lista);

        }
            */
        System.out.println(lista);
      /* 
        //hacer uso de remove con el for extendido, no es permitido
        for (Animal a: lista){
            if (a instanceof Caballo) {
                System.out.println(a);
                lista.remove(a);// da ConcurrentModificationException
            
            }
        }
        */
        System.out.println("Enter para continuar...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("Uso del iterador (para borrar)");
        Iterator<Animal> it = lista.iterator();
        while (it.hasNext()) {

            Animal a = it.next();
            a.eat();
            if (a instanceof Caballo) {
                //Caballo h4 = (Caballo) a;
                it.remove();
            }
        }

        System.out.println(lista);
    }
}