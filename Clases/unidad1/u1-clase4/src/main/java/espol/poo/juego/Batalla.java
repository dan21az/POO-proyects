package espol.poo.juego;

import java.util.Scanner;

public class Batalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear dos personajes
        Personaje jugador1 = new Personaje("FuegoMax", 60, 20);
        Personaje jugador2 = new Personaje("HieloBot", 80, 15);

        System.out.println("Batalla de Personajes");
        jugador1.mostrarEstado();
        jugador2.mostrarEstado();
        System.out.println("-------------------------");

        // Turnos de batalla
        int turno = 1;
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("Turno #" + turno);

            if (turno % 2 != 0) {
                jugador1.atacar(jugador2);
            } else {
                jugador2.atacar(jugador1);
            }

            jugador1.mostrarEstado();
            jugador2.mostrarEstado();
            System.out.println("-------------------------");

            turno++;

            // Esperar que el usuario presione Enter para continuar
            System.out.println("Presiona Enter para continuar...");
            scanner.nextLine();
        }

        // Mostrar resultado
        if (jugador1.estaVivo()) {
            System.out.println("¡" + jugador1.nombre + " gana la batalla!");
        } else {
            System.out.println("¡" + jugador2.nombre + " gana la batalla!");
        }

        scanner.close();
    }
}
