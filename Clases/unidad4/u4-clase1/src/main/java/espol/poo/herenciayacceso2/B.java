/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.herenciayacceso2;
import espol.poo.herenciayacceso1.Padre;
/**
 *
 * @author Gladys
 */

public class B extends A{
//public class B extends Padre{
    public int k;
    void showk () {
        System.out.println("k:" + k );
        
    }

     void suma () {
        System.out.println("i + j + k:" + (i + j + k));
    }
}