package espol.poo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.CollationElementIterator;
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
        //y muestre ordenada

        ArrayList<Jugador> lista = Jugador.obtenerJugadores(path);
        //cree un nuevo archivo 

        Collections.sort(lista);

        System.out.println(lista);


    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("archivos/jugadoresOrd.txt"))) {

        for (Jugador j : lista) {
            String[] datos = new String[4];
            datos[0] = j.getNombre();
            datos[1] = j.getPosicion();
            datos[2] = j.getEquipo().getNombre();
            datos[3] = j.getEquipo().getAbrev();

            String linea = String.join(";", datos);
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
        
}
