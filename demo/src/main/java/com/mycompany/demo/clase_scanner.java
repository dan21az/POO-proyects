package com.mycompany.demo;

import java.util.Scanner;

class EjemploScanner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Se crea un objeto con la clase Scanner(System.in)
    System.out.print("Ingrese su nombre: ");
    // ingreso de string
    String nombre = sc.nextLine(); //Solo el nextLine() elimina el enter del salto
    System.out.print("Ingrese su edad: ");
    // ingreso de número entero
    int edad = sc.nextInt();
    System.out.print("Ingrese su salario: ");
    double salario = sc.nextDouble();
    sc.close(); //Deja de pedir datos por teclaso
    //mostrar datos ingresados por el usuario
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Salario: " + salario);
  }
}

class area_circulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Ingresa por teclado el radio
        System.out.print("Ingrese el radio: ");
        int radio = entrada.nextInt();

        entrada.close();

        double area = 3.14 * radio * radio;

        System.out.println("El área del círculo es: " + area +" unidades");

    }

}

public class clase_scanner {
    
}
