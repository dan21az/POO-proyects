/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.unidad5.exc3;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
class Prueba extends Exception { }
/**
 *
 * @author Gladys
 */
public class TestExc {
    private ArrayList<String> lista;
    public TestExc(){
       // lista = new ArrayList<>();
    }
    public static void main(String[] args) {
        


        int a=0;
       


        try {
            a = dividir(5, 2);
            System.out.println("He dividido");
        } catch (MalNumeroADividir err) {
            System.out.println("en bloque catch");
            System.out.println(err);
            System.out.println(err.getMessage());
            a = 0;
        } finally {
            System.out.println("Ex manejada");
        }
        System.out.println("Valor de a = " + a);

        
    }

    public static int dividir(int a, int b) throws MalNumeroADividir{
        if (b == 0) {
            MalNumeroADividir oex =new MalNumeroADividir();
            throw oex;
           
        }
        System.out.println("Antes de dividir");
        return a / b;
    }
    

}
