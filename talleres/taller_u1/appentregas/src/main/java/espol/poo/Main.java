package espol.poo;
import java.util.Scanner;



import espol.poo.modelo.Paquete;
import espol.poo.modelo.Repartidor;
public class Main {
    public static void ejercicio1(){
        short x  = (short) (100*Math.random()+1);
        int num = 0; //Suma total
        int i = 0; //Contador de numeros

        while (num<=500){
            num = num+x;
            i++;
        }
        
        if (num>=500){
            System.err.println("La suma total es: "+num);
            System.out.println("Cantidad de números generados: : "+i);
        }
    }
    public static void ejercicio2(){
        //Ingresamos la info del repartidor
        Scanner entrada = new Scanner(System.in);
        System.err.print("Ingrese nombre del repartidor: ");
        String nombre = entrada.nextLine();
        Repartidor repartidor1 = new Repartidor(nombre, 15);

        //Ingresamos los paquetes
        System.err.print("Ingrese código de paquete 1: ");
        String codigo1 = entrada.nextLine();
        System.err.print("Ingrese peso de paquete 1: ");
        double peso1 = entrada.nextDouble();
        entrada.nextLine();
        Paquete paquete1 = new Paquete(codigo1, peso1);

        System.err.print("Ingrese código de paquete 2: ");
        String codigo2 = entrada.nextLine();
        System.err.print("Ingrese peso de paquete 2: ");
        double peso2 = entrada.nextDouble();
        entrada.nextLine();
        Paquete paquete2 = new Paquete(codigo2, peso2);

        entrada.close();

        //Asignacion de paquete
        System.err.println("Asignando paquete 1");
        repartidor1.asignarPaquete(paquete1);

        System.err.println("Asignando paquete 2");
        repartidor1.asignarPaquete(paquete2);
        
        System.err.println("Asignando paquete 2");
        repartidor1.asignarPaquete(paquete2);

        paquete2.actualizarEstado("Entregado");

        //Se muestra los detalles
        paquete1.mostrarDetalles();
        paquete2.mostrarDetalles();
    }
    public static void main(String[] args) {
        System.out.println("TALLER 1");
        ejercicio1();
        ejercicio2();
    }
}