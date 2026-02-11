package espol.poo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import espol.poo.modelo.Jugador;

public class Main {
    public static void main(String[] args) {
        System.out.println("Práctica unidad 5");
        //variable con la ruta del archivo a leer
        //String path =  System.getProperty("java.class.path") + "/archivos/jugadores.csv";
        String path = "archivos/jugadores.csv";
        ArrayList<Jugador> lista = Jugador.obtenerJugadores(path);
        System.out.println(lista);
        
        /* 
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("listaJugadores.ser"));) {
            out.writeObject(lista);
            out.flush();
        }  catch(IOException e){
            System.out.println(e.getMessage());
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }

*/
            ArrayList<Jugador> lista_deserializada = null;
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("listaJugadores.ser"))) {
            lista_deserializada = (ArrayList<Jugador>) in.readObject();
        }  catch(IOException e){
            System.out.println(e.getMessage());
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(lista_deserializada);

/* 
Con el archivo generado en el paso 2 (listaJugadores.ser), trate de deserializar nuevamente la lista de jugadores. 
¿Lo pudo realizar?  Si no pudo, revise el mensaje de error para entender la razón.

        Error: espol.poo.modelo.Jugador; local class incompatible: stream classdesc serialVersionUID = 4910767649234243349, local class serialVersionUID = 1555553694456923298
        null

    No se pudo deseralizar ya que la clase local Jugador es una versión diferente a la serializada en el archivo.

*/
    } 
}