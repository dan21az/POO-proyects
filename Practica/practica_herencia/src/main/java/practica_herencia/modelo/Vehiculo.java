package practica_herencia.modelo;

public class Vehiculo {
    protected String placa;
    protected String marca;
    protected float precio;


public Vehiculo(String placa, String marca, float precio) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
    }

public double cotizarVehiculo(int dias){
    double valorPago = dias * precio;
    return valorPago;
}

public String toString(){
    return "Placa: " + placa + "\nMarca: " + marca + "\nPrecio: " + precio;
}

}
