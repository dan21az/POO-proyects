/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.herenciayacceso2;

/**
 *
 * @author Gladys
 */
public class SimpleHerencia {
    

    public static void main (String args[]) {
        A superOb = new A();
        B subOb = new B();

        // La superclase se puede utilizar por sí misma
 
        superOb.i = 10;
        superOb.j = 20;
        System.out.println ("Contenidos de superOb:");
        superOb.showij();
        System.out.println();
  
        /* La subclase accede a todos los miembros públicos de la su superclase. */

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contenidos de subOb:");
        subOb.showij();
        //subOb.showk();
        System.out.println();
        System.out.println("Suma de i, j y k a subOb:");
        subOb.suma();
    }
}