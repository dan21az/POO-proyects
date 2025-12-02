package espol.poo.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//completar para que se pueda  ordenar
public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private String posicion;
    private EquipoFutbol equipo;

    public Jugador(String nombre, String posicion, EquipoFutbol equipo) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public EquipoFutbol getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", equipo=" + equipo + '}';
    }


    public static ArrayList<Jugador> obtenerJugadores(String ruta){
         ArrayList<Jugador> jugadores = new  ArrayList<>();
        //completar para leer el archivo y llenar la lista
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta))) {
            String line="";
            while ((line = bufferedReader.readLine()) != null) {
                //separar los datos 
                String[] datos = line.split(",");
                //crear objetos Equipo y Jugador
                EquipoFutbol e = new EquipoFutbol(datos[2], datos[3]);
                Jugador j = new Jugador(datos[0], datos[1], e);
                jugadores.add(j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
        }
        
        return jugadores;
    }

    @Override
    public int compareTo(Jugador otro) {
        return (otro.nombre.compareTo(this.nombre));
    }





           
}
