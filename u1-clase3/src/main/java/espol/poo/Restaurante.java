package espol.poo;

public class Restaurante {
    String nombre;
    Boolean pickup;

    public void procesarPedido(String pedido, Cliente cl ) {
        System.out.println("Procesando pedido '" + pedido + "' del cliente " + cl);
    }

}
