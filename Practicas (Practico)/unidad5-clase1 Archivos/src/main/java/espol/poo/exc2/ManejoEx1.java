/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.exc2;



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
    
        System.out.println("Valor de a"+a);
    }
}
