
package practica_herencia.modelo;

/**
 *
 * @author Usuario
 */
public class Camion extends Vehiculo {
    private int capacidad;
    private boolean refrigerado;
    
    public Camion (String pl, String m, float pr,int c, boolean r){
        super(pl, m, pr);
        this.capacidad = c;
        this.refrigerado = r;
    }
    
    public double cotizarVehiculo(int dias){
        double valorPago = super.cotizarVehiculo(dias) + 50;
        return valorPago;
    }
    
    public String toString(){
        return "Tipo: Camion\n"+super.toString()+"\nCapacidad: "+capacidad+" toneladas"+"\nRefrigerado?: "+refrigerado;
    }
}
