package espol.poo;

import java.util.ArrayList;
import java.util.Collections;

import espol.poo.modelo.Jugador;

public class Main {
    public static void main(String[] args) {
        System.out.println("Práctica unidad 5");
        //variable con la ruta del archivo a leer
        //String path =  System.getProperty("java.class.path") + "/archivos/jugadores.csv";
        String path = "archivos/jugadores.csv";
        ArrayList<Jugador> lista = Jugador.obtenerJugadores(path);
        System.out.println(lista);


        
    }
}