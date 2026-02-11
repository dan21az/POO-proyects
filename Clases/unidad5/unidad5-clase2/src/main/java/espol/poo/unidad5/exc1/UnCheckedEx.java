/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.unidad5.exc1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gladys
 */
public class UnCheckedEx {
    public static void main(String[] args)  {
        int i =0;
        

        try{
             i = 10/0;
            
           // System.out.println("valor de i:"+i);
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("valor de i:"+i);
        }
        System.out.println("fin");
    }
}
