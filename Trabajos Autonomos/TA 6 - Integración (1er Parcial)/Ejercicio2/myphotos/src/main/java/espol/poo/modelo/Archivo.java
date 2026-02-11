package espol.poo.modelo;

public abstract class Archivo {
    private String nombre;
    private String fecha;
    private double tamano;




    public Archivo(String nombre, String fecha, double tamano) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tamano = tamano;
    }
    public String getFecha() {
        return fecha;
    }
    @Override
    public String toString() {
        return "Nombre:" + nombre + " - Tamaño:" + tamano ;
    }
}
