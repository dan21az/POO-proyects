/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.herenciayacceso1;

/**
 *
 * @author Gladys
 */


// Creación de la superclase A.
public class A {
    protected int i, j;
    protected boolean showij() {
        System.out.println("i y j:" + i + " " + j);
      return true;
    }
}