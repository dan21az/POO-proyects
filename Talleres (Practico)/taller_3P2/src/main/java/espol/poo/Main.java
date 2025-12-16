package espol.poo;

import java.util.ArrayList;
import java.util.Collections;

import espol.poo.modelo.*;

//completar de acuerdo a las instrucciones
public class Main {
    public static void main(String[] args) {
        System.out.println("Taller unidad 5");
        //variable con la ruta del archivo a leer
        String path =  "archivos/datos.txt";
        //String path =  System.getProperty("java.class.path") + "/archivos/datos.txt";
        //completar
        ArrayList <Archivo> archivos = Archivo.leerArchivos(path);
        
        Collections.sort(archivos);
        System.out.println(archivos);
        
        try {
            int i = verificarCapacidad(archivos);
            System.out.println(i);
        } catch (ExcedeCapacidad e) {
            System.out.println(e);
        }

    }

    public static int verificarCapacidad(ArrayList<Archivo> ar) throws ExcedeCapacidad{
        int total = 0;
        for(Archivo a : ar){
                total = total + a.getTamano();
            }
        if(total>1000){
            ExcedeCapacidad e = new ExcedeCapacidad();
            throw e;
        }
        return total;

    }
}