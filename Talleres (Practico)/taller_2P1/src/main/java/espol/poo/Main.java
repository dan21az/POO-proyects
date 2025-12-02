package espol.poo;

import espol.poo.modelo.*;

public class Main {
    public static void main(String[] args) {
        // Crear equipos y personajes
        Equipo equipo1 = new Equipo("Equipo Rojo");
        equipo1.agregarPersonaje(new Guerrero("Guerrero Rojo", 100, 20, 10,2));
        equipo1.agregarPersonaje(new Mago("Mago Rojo", 80, 25, 5));

        Equipo equipo2 = new Equipo("Equipo Azul");
        equipo2.agregarPersonaje(new Guerrero("Guerrero Azul", 90, 18, 12,2));
        equipo2.agregarPersonaje(new Mago("Mago Azul", 70, 30, 3));

        // Simulación de la batalla
        int turno = 1;
        //COMPLETAR DE ACUERDO A LAS INSTRUCCIONES

        while(equipo1.estaDerrotado() || equipo2.estaDerrotado()){
            System.out.println("** Ronda "+turno+" **");
            equipo1.atacarOtroEquipo(equipo2);
            equipo2.atacarOtroEquipo(equipo1);
            if(equipo1.estaDerrotado()){
            System.out.println("¡"+equipo2.getNombre()+" gana! ");
            } else{
            System.out.println("¡"+equipo1.getNombre()+" gana! ");
            }
            turno++;
        }


    }


}


