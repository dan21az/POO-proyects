/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.modelo;

import java.io.FileReader;

/**
 *
 * @author Gladys
 */




import java.util.ArrayList;
import java.io.*;
public class ClienteBancario extends Thread{
    private String cedula;
    private String nombre;
    private double balance;
    private String archTX; //ruta al archivo de transacciones

    public ClienteBancario(String cedula, String nombre, double balance, String archTX) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.balance = balance;
        this.archTX = archTX;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBalance() {
        return balance;
    }

    public String getArchTX() {
        return archTX;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ClienteBancario{" + "nombre=" + nombre + ", balance=" + balance + '}';
    }


    public static ArrayList<ClienteBancario> getClientes(){
        ArrayList<ClienteBancario> lista = new ArrayList<>();
      
        lista.add(new ClienteBancario("1234567890", "Mario Calle",50,"archivos/TX1234567890.txt"));
        lista.add(new ClienteBancario("0934567812", "Valeria Naranjo",100,"archivos/TX0934567812.txt"));
        lista.add(new ClienteBancario("1334567892", "Jaime Guerrero",120,"archivos/TX1334567892.txt"));
        return lista;
    }

   

    public static void main(String[] args) {
         ArrayList<ClienteBancario> lista = getClientes();
         System.out.println(lista);

         actualizarBalances(lista);
         



    }
    
    public static void actualizarBalances(ArrayList<ClienteBancario> lstClientes) {
        for (ClienteBancario c: lstClientes){
            //c.start();
            //implementación con expresión lambda
            Thread hilo = new Thread(
                ()->{
                    
                    //inicio método run
                    try(BufferedReader br = new BufferedReader(new FileReader(c.archTX))) {
                        String linea="" ;
                        while (  (linea = br.readLine()) != null){

                            String[] datos = linea.split(",");
                            if (datos.length==2){
                                try{
                                    if (datos[0].equals("debito")){
                                        c.balance-= Double.parseDouble(datos[1]);
                                    }else if (datos[0].equals("credito")){
                                        c.balance+= Double.parseDouble(datos[1]);
                                    }
                                }catch(Exception e){
                                    System.out.println(e.getMessage());
                                }
                            }
                        }
                        System.out.println("Cliente " + c.nombre + " balance actualizado: " + c.balance);

                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                        
                    }catch (IOException e) {
                        System.out.println(e.getMessage());
                        
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                        
                    }

                    //fin método run
                }

            );
            hilo.start();
        }
   
    }

    public void run(){

        try(BufferedReader br = new BufferedReader(new FileReader(archTX))) {
            String linea="" ;
            while (  (linea = br.readLine()) != null){

                String[] datos = linea.split(",");
                if (datos.length==2){
                    try{
                        if (datos[0].equals("debito")){
                            balance-= Double.parseDouble(datos[1]);
                        }else if (datos[0].equals("credito")){
                            balance+= Double.parseDouble(datos[1]);
                        }
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
            System.out.println("Cliente " + nombre + " balance actualizado: " + balance);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            
        }catch (IOException e) {
            System.out.println(e.getMessage());
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }
}
