/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.unidad5.exc2;

import java.util.ArrayList;

/**
 *
 * @author Gladys
 */
public class ManejoEx1 {

    

    public static void main(String[] args) {
        int a =0;
        String saludo = "Hola";
        try {
            
            saludo = saludo.toUpperCase();
            a = 5 / 0;
            

            
        } catch (ArithmeticException err) {
            System.out.println(err.getMessage());
            a = 3;
        }  
        
        try{
            
                int b = 3 / 0; 
         }catch (ArithmeticException err) {
                System.out.println(err.getMessage());
            }
        System.out.println("Valor de a"+a);
    }
}
