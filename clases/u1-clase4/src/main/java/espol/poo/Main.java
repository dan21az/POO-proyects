package espol.poo;

import espol.poo.modelo.*;

public class Main {
    public static void main(String[] args) {
       
        System.out.println("Clases y objetos");
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Gladys");  
        
        System.out.println(cliente1.getNombre());
        //llamando a  metodos
        cliente1.revisarMenu();
        cliente1.pagar(30);
        Factura f1 = new Factura(50);
        Factura f2 = new Factura("2025-05-20",50);
        f1.total = 30;
        cliente1.pagarFactura(f1);
 
        Restaurante r1 = new Restaurante();
        
        
        r1.procesarPedido("Alitas", cliente1);
    }
}