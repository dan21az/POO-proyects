package com.example;

import java.util.Scanner;

class vehiculo { //Se crea la clase
    int placa;
    String color;
    int capacidad;

    int getPlaca() { //"Tipo getNombre()": permite extraer el valor de un atributo (Hay que declarar el tipo)
        return placa;   
    }

    String getColor() {
        return color;
    }

    int getCapacidad() {
        return capacidad;
    }

    void setColor (String color) { //"void setNombre(Tipo Atributo)""
        this.color = color;        //"Permite modificar el valor de un atributo de un objeto, se escribe como un constructor "
    } 

    }

public class get_set {
    public static void main(String[] args) {

        vehiculo vehiculo1 = new vehiculo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la placa del vehículo: ");
        vehiculo1.placa = entrada.nextInt();
        entrada.nextLine(); //Solo el nextLine() elimina el enter del salto
        System.out.print("Ingrese el color del vehículo: ");
        vehiculo1.setColor(entrada.nextLine()); //Al usar objeto.setNombre, el nuevo atributo va en el paréntesis
        System.out.print("Ingrese la capacidad del vehículo: ");
        vehiculo1.capacidad = entrada.nextInt();
        
        entrada.close();

        System.out.println("Su vehiculo tiene: ");
        System.out.println("Placa: " + vehiculo1.getPlaca()); //Para usar get, es objeto.getNombre()
        System.out.println("Color: " + vehiculo1.getColor());
        System.out.println("Capacidad: " + vehiculo1.getCapacidad()+ " personas.");

    }
}