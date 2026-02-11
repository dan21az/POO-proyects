/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.unidad5.exc4;

import espol.poo.unidad5.exc3.MalNumeroADividir;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gladys
 */
public class ManejoEx3 {

    public static void main(String[] args) throws ExcepcionIntervalo {
        String str1 = "20o";
        String str2 = "3";
        String respuesta="";
        int numerador, denominador, cociente;
        try {
            numerador = Integer.parseInt(str1);
            denominador = Integer.parseInt(str2);
            try{
              rango(numerador, denominador);
            }catch(ExcepcionIntervalo e){
                respuesta = e.getMessage();
            }
            System.out.println("xxxxxx");
            cociente = dividir(numerador, denominador);
            respuesta = String.valueOf(cociente);
        } catch (NumberFormatException ex) {
            respuesta = "Se han introducidos caracteres no numéricos";
        }  catch (MalNumeroADividir ex) {
            respuesta = ex.getMessage();
        } 
        System.out.println("Todas las excepciones han sido atrapadas");
        System.out.println(respuesta);
    }

    public static void rango(int num, int den) throws ExcepcionIntervalo {
        if ((num > 100) || (den < -5)) {
            throw new ExcepcionIntervalo("Números fuera del intervalo");
        }
    }

    public static int dividir(int a, int b) throws MalNumeroADividir {
        if (b == 0) {
            throw new MalNumeroADividir();
        }
        return a / b;
    }
}
