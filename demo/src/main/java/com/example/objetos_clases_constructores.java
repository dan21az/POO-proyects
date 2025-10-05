package com.example;

//Se define una clase (plantilla para crear objetos)
class Persona { //Nombre de la clase
    //Atributos: Característica que tendran los objetos que se creen con esta clase
    String nombre;
    int edad;

    // Métodos: Acciones que podrán realizar los objetos cuando se llame a la accion 
    void saludo() {
        System.out.println("Hola " + nombre );
    }

    // Constructores (método): se usa al crear el objeto, indica que atributos tienen que asignarle un valor
    // Debe tener el mismo nombre de la clase
    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }
}

class CuentaBancaria {
    int numero;
    String nombre;
    float saldo;
    String tipo;

    void info() {
        System.out.println("Hola " + nombre + ", su número de cuenta es: " + numero + " de tipo " + tipo);
    }

    void saldo() {
        System.out.println("El saldo de la cuenta " + numero + " es: " + saldo);
    }

    public CuentaBancaria(int numero, String nombre, String tipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
    }
} 


public class objetos_clases_constructores { //La clase principal (o Main) debe tener el nombre del archivo
    public static void main(String[] args) { //Esto indica que la clase se puede ejecutar (creo)
    Persona p1 = new Persona("Daniel", 20); //Se crea un objeto con la clase (plantilla)
    p1.saludo(); //Debe ir "new" seguido del nombre del constructor
    
    /* En caso no crear un constructor en el objeto, hay que asignar los atributos manualmente:
        Persona p1 = new Persona();    
        p1.nombre = "Daniel";
        p1.edad = 20;
    Si no se asigna atributos toman los valores por defectos del tipo de dato que son
    */

    CuentaBancaria cb1 = new CuentaBancaria(123456, "Daniel", "Corriente");
    cb1.info(); //Ya que esta declarado el constructor debe ir valores SI O SI en los parentesis , SINO ERROR
    cb1.saldo();

    }
}