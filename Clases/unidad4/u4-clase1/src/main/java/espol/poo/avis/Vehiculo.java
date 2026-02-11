package espol.poo.avis;

public class Vehiculo {
    protected String placa;
    protected String marca;
    protected float precio;
    
    public Vehiculo(String placa, String marca, float precio) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


}
