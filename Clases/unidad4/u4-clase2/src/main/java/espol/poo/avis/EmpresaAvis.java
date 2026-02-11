/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.avis;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gladys
 */
public class EmpresaAvis {
    //en la lista puedo almacenar tanto los camiones como los carros de turismo
    public static ArrayList<Vehiculo> listaVehiculos ;


    
  public static void agregarVehiculo(Vehiculo v){
        listaVehiculos.add(v);
  }
  
    public static void mostrarVehiculos(){
        for(Vehiculo v:listaVehiculos){
            System.out.println(v);
        }
    }
      //completar
   // el método retorna verdadero si el vehiculo con el id del param existe en la lista
    public static boolean vehiculoExiste1(String placa){
      for (Vehiculo v:listaVehiculos){
        if (v.getPlaca().equals(placa)) return true;
      }
      return false;
    }
    public static boolean vehiculoExiste(String placa){
      return listaVehiculos.contains(new Camion(placa));
      

    }
  public static Vehiculo recuperarVehiculo(String placa){
     Vehiculo v =null;
     if (listaVehiculos.contains(new Camion(placa))){
       int ind = listaVehiculos.indexOf(new Camion(placa));
       return listaVehiculos.get(ind);
       
     }
      return v;

  }
    public static void ingresarVehiculo(){        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehiculo: Turismo(T) o Camion (C)");
        String tipo = sc.nextLine();
        System.out.println("Ingrese placa:");
        String placa = sc.nextLine();
        System.out.println("Ingrese marca:");
        String marca = sc.nextLine();
        //validar que no exista vehiculo con esa placa
        
        while (vehiculoExiste(placa)){
            System.out.println("Ya existe vehiculo con esa placa\nIngrese placa:");
             placa = sc.nextLine();
        }
        System.out.println("Ingrese precio:");
        int precio = sc.nextInt();
        if (tipo.equals("T")){
            //TODO completar pedir los atributos para turismo y crear objeto
        }else{
            //TODO completar pedir los atributos para camion y crear objeto
        }
        //TODO agregar objeto a la lista
      
    }


    public static void main(String[] args) {
        listaVehiculos = new ArrayList<>();
        agregarVehiculo(new CarroTurismo("GSD3708", "Hyunday", 45 , 5));
        agregarVehiculo(new Camion("GDE0905", "HINO", 150, 2, true));
        System.out.println(listaVehiculos.get(0).equals(listaVehiculos.get(0)));
        
        Vehiculo v = recuperarVehiculo("GSD3708");
        System.out.println(v);
       
        //solicitar el ingreso de un nuevo vehiculo
        ingresarVehiculo();
        mostrarVehiculos();
       
    }

}
