package espol.poo.modelo;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
//completar para que se pueda serializar y ordenar
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
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea = "";
            while ((linea = br.readLine())!=null){
                String datos[] = linea.split(",");
                EquipoFutbol eq = new EquipoFutbol(datos[2], datos[3]);
                Jugador j = new Jugador(datos[0], datos[1], eq);
                jugadores.add(j);
            }
            
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return jugadores;
    }



    @Override
    public int compareTo(Jugador o) {
        return o.nombre.compareTo(this.nombre);
    }






           
}
