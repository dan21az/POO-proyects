/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.herenciayacceso1;

import java.util.Scanner;

/**
 *
 * @author Gladys
 */
public class SimpleHerencia {
    

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        A superOb = new A();
        B subOb = new B();

        // La superclase se puede utilizar por sí misma
 
        superOb.i = 10;
        superOb.j = 20;
        System.out.println ("Contenidos de superOb:");
        superOb.showij();
        System.out.println("Presione enter para continuar");
        sc.nextLine();

        /* La subclase accede a todos los miembros públicos y protected de la superclase. */

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contenidos de subOb:");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Suma de i, j y k a subOb:");
        subOb.suma();
        sc.close();
    }
}