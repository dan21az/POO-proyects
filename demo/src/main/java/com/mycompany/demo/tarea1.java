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

class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();;
        int suma = 0;
        while ( numero > 0) {
            int digito = numero % 10;
            suma  = suma + digito;
            numero = numero/10;
        }
        System.out.println("La suma es: " + suma );
        entrada.close();
    }
}

class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Adivina el número");
        Scanner entrada = new Scanner(System.in);
        short x  = (short) (100*Math.random()+1);
        int i = 5;
        boolean ganador = true;
        while(ganador && (i>0)) {
            System.out.println("Tienes " + i +" intentos.");
            System.out.print("Ingresa un número: ");
            int numero = entrada.nextInt();
            if(numero == x) {
                ganador = false;
                System.out.println("Acertaste!, el número es: "+x);
            } else if(numero<x) {
                System.out.println("El número que ingresaste es menor al que buscas.");
            } else if(numero>x) {
                System.out.println("El número que ingresaste es mayor al que buscas.");
            }
            i = i-1;
        }
        entrada.close();
        if(ganador == true && i==0) {
            System.out.println("Perdiste!, el número era: "+x);
        }
    }
}
public class tarea1 {

}
