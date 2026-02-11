package espol.poo.ejercicios;
import java.util.ArrayList;

class Juguete {
    String nombre;
    double precio;
    public Juguete(String nombre,double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
 
    public void avisarPrecio() {
        System.out.println("Este "+nombre+" se vende en " + precio);
    }
}
 
 class JugueteElectronico extends Juguete{
    int baterias;
    public JugueteElectronico(String nombre, int baterias, int precio) {  
        super(nombre,precio);
        this.baterias = baterias;
        
    }
}
 

public class Jugueteria {
 
    public static void main(String[] args) {
        ArrayList<Juguete> stock = new ArrayList<>();
        stock.add(new Juguete("pelota",5));
        stock.add(new JugueteElectronico("robot",4,25));
        stock.add(new JugueteElectronico("cámara infantil",3,75));
        stock.get(2).avisarPrecio();
    }
}
