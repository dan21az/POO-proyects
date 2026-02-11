package espol.poo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

import espol.poo.modelo.Jugador;

public class Main {
    public static void main(String[] args) {
        System.out.println("Práctica unidad 5");
        //variable con la ruta del archivo a leer
        //String path =  System.getProperty("java.class.path") + "/archivos/jugadores.csv";
        String path = "archivos/jugadores.csv";
        //llamar al método obtenerJugadores de la clase Jugador
       
        ArrayList<Jugador> lista = Jugador.obtenerJugadores(path);
        System.out.println(lista);
    
        //TODO: muestre la lista ordenada
        
        //TODO: cree un nuevo archivo con la lista ordenada 



        
    }
}