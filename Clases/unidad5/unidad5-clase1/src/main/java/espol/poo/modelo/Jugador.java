package espol.poo.modelo;

import java.util.ArrayList;
//completar para que se pueda  ordenar
public class Jugador{
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
        
        
         return jugadores;
    }











           
}
