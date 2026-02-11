/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.threads;

/**
 *
 * @author Gladys
 */
public class EjemploHilos {
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        tarea1.setName("Hilo1");
       
        tarea2.run();
        System.out.println("INICIO");
        tarea1.start();
        tarea2.start();
       // tarea1.start(); no se puede iniciar nuevamente
        System.out.println("FINAL");
    }
    
}
