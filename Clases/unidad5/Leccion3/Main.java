package poo.espol;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        pedirDatos();
    }

    public static void pedirDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingreso de empleados");
        System.out.print("Ingrese cedula:");
        String cedula = sc.nextLine();
        try(FileWriter fw = new FileWriter("empleados.txt")){  
        while (! cedula.equals("0")){

            System.out.print("Ingrese nombre:");
            String nombre = sc.nextLine();
            double sueldo =0;
            while (sueldo<=0){
                try{
                    System.out.print("Ingrese sueldo:");
                    sueldo = sc.nextDouble();
               
                }catch(Exception e){
                    System.out.println("Sueldo incorrecto");
                    //System.out.println(e);
                }
                sc.nextLine();
            }
            
            
            String linea = cedula + ","+ nombre+","+sueldo+"\n";
            System.out.println(linea);
            //escribir en el archivo
            fw.write(linea);
            System.out.print("Ingrese cedula:");
            cedula = sc.nextLine();
        }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}