package espol.poo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Clases y objetos");
        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Gladys"; 
        //llamando a  metodos
        cliente1.revisarMenu();
        cliente1.pagar(30);
        Factura f1 = new Factura();
         f1.total = 30;
         cliente1.pagarFactura(f1);
     
    }
}