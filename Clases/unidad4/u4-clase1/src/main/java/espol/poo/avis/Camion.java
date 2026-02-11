package espol.poo.avis;

public class Camion extends Vehiculo{
    private float capacidad;
    private boolean esRefrigerado;

    public Camion(String placa, String marca, float precio, float capacidad, boolean esRefrigerado) {
        super(placa, marca, precio);
        this.capacidad = capacidad;
        this.esRefrigerado = esRefrigerado;
    }

    public void mostrarDetalles(){
        System.out.println("Marca:"+marca);
    }

}
