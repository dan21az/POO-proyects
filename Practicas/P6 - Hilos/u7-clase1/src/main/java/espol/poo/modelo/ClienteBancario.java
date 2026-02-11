/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.modelo;

/**
 *
 * @author Gladys
 */



import java.io.BufferedReader;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;
import java.security.spec.ECFieldF2m;
import java.util.ArrayList;

public class ClienteBancario {
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

        class Hilo extends Thread{

            private ClienteBancario cliente;

            public Hilo(ClienteBancario c){
                this.cliente = c;
            }

            @Override

            public void run(){

                System.out.println("Procesando transacciones de cliente: " + cliente.getNombre());

                double balance = cliente.getBalance();

                try (BufferedReader br = new BufferedReader(new FileReader(cliente.archTX))) {

                    String linea;
                    while((linea= br.readLine())!= null){
                    String[] transaccion = linea.split(",");
                    String tipo = transaccion[0];
                    double monto = Double.parseDouble(transaccion[1]);

                    if (tipo.equals("credito")) {
                        balance += monto;
                    } else if (tipo.equals("debito")) {
                        balance -= monto;
                    }
                }

                cliente.setBalance(balance);

                System.out.println("Cliente actualizado " + cliente.getNombre() + " Balance:" + cliente.getBalance());

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        }

        for(ClienteBancario c: lstClientes){
            Hilo hilo = new Hilo(c);
            hilo.start();
        }
    }


}
