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

public class B extends A {
    protected int k;
    void showk () {
        this.showij();
        System.out.println("k:" + k);
    }

    void suma () {
        System.out.println("i + j + k:" + (i + j + k));
        
    }
}