package espol.poo.practica;

import java.util.Scanner;

import java.util.ArrayList;

import espol.poo.modelo.Estudiante;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        for (int i=1;i<4;i++){
            System.out.print("Persona "+i+" nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Persona "+i+" altura: ");
            float altura = Float.parseFloat(entrada.nextLine());
            Persona p = new Persona(nombre,altura);
            personas.add(p);
        }
        entrada.close();

        int [] mostrar = convertirAlturas(personas);
        for (int altura: mostrar){
            System.out.println(altura);
        }

    }

    public static int[] convertirAlturas(ArrayList<Persona> personas){
        int[] intAlturas = new int[3];
        int i = 0;
        for (Persona persona: personas){
            float floatAltura = persona.getAltura();
            int altura = Float.valueOf(floatAltura).intValue();
            intAlturas[i] = altura;
            i++;
        }
        return intAlturas;
    }
}
/*Responda ¿Qué métodos de conversión ha utilizado para obtener el array de valores tipo int?
    Se utilizan los metodos valueOf() e intValue(), para convertir el dato primitivo float al Float, y luego con intValue() se convierte a un dato int*/
