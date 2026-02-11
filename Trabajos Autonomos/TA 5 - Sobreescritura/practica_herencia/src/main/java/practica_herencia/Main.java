package practica_herencia;
import practica_herencia.modelo.*;

public class Main {
    public static void main(String[] args) {
        Turismo t1 = new Turismo("GSD3708", "Hyunday",45,5);
        Camion c1 = new Camion("GDE0905","HINO",150,2,true);
        
        System.out.println("Cotizar Turismo por 5 dias");
        System.out.println("valor a pagar: " + t1.cotizarVehiculo(5));
        
        System.out.println("Cotizar Camion por 30 dias");
        System.out.println("valor a pagar: " + c1.cotizarVehiculo(30));
        
        System.out.println(t1.toString());
        System.out.print(c1.toString());
        
    }
}