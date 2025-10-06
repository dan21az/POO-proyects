package com.mycompany.demo;

import java.util.Scanner;

class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese base del triángulo: ");
        double base = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Ingrese altura del triángulo: ");
        double altura = entrada.nextDouble();
        entrada.close();
        double area = (base * altura) / 2;
        System.out.println("El área es: " + area);
    }
}

class ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        entrada.close();

        int i = 0;

        while(i <= 12 ) {
            System.out.println(numero + " * " + i + "\t=\t" + (numero*i)   );
            i ++;
        }
    }
}

class ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i=0;

        while(i < 5) {
            System.out.print("Ingrese un año: ");
            int year = entrada.nextInt();
            i ++;
            if( ( (year%4) == 0 ) && ( (year%100) != 0 ) ) {
                System.out.println("El año " + year + " es bisiesto.");
            } else {
                if( ( (year%100) != 0) && ( (year%400) == 0 ) ) {
                System.out.println("El año es " + year + " es bisiesto.");
                } else {
                    System.out.println("El año es no " + year + " es bisiesto.");
                }
            } 
        }
        entrada.close();
    }
}


class ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean condicion = true;
        double suma = 0;
        int contador = 0;

        while(condicion) {
            System.out.print("Ingrese un número: ");
            double numero = entrada.nextDouble();
            if(numero>0) {
                suma = suma + numero;
                contador ++;
            } else {
                System.out.println("El promedio es: " + (suma/contador) );
                condicion = false;
            }
        }
        entrada.close();
    }
}

public class tarea1 {
    public static void main(String[] args) {
        System.out.println('X'*4);
    }
}
