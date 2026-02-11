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
public class ManejoEx2 {
     

    public static void main(String[] args) {
        int a = 0;
        try {
            a = 5/0;
            System.out.println("valor de a:"+a);
        } catch (Exception err) {
           
            System.out.println("Un error fue capturado"+err);
            err.printStackTrace();
        }finally{
            a = 4;
            System.out.println("bloque finally ejecutado");
        }
        System.out.println(a);
    }
}
