package espol.poo.u1.clase5.modelo;

public class Comida {
    private String nombre;
    private float precio;

    public Comida(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Comida [nombre=" + nombre + ", precio=" + precio + "]";
    }

    
}
