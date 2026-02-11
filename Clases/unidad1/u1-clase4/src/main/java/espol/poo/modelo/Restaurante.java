package espol.poo.modelo;

public class Restaurante {
    String nombre;
    boolean pickup;
    
    public void procesarPedido(String pedido, Cliente cl){
        System.out.println("Procesando pedido " + pedido + " del cliente " + cl.getNombre());
    }
    
}