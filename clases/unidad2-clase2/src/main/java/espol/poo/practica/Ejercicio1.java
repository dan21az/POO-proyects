/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.practica;

import java.util.ArrayList;

/**
 * Ejercicio de práctica de objeto Wrapper a partir de un string
 *
 * @author 
 */
public class Ejercicio1 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Double> difTemperatura = new ArrayList<>();
        String info = "15.8-18.9;16.6-19.2;15.5-21.2;14.8-20.1;16.2-18.9;15.4-19.5";
        //a partir de la variable info extraer las temperaturas y almacenar la diferencia en la lista difTemperatura
        
        String[] gruposEquipos = info.split(";");

        for (String equipo : gruposEquipos) {
                String[] temperaturas = equipo.split("-");
                double tempInicial = Double.parseDouble(temperaturas[0]);
                double tempFinal = Double.valueOf(temperaturas[1]);
                double diferencia = tempFinal - tempInicial;
                difTemperatura.add(diferencia);
            }
        System.out.println(difTemperatura);

    }

    /* 1.- ¿Qué métodos puede usar para convertir de String a Double? 
     *  Se puede usar el método Double.parseDouble() y el método Double.valueOf
     * 
    */
}
