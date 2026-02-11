package espol.poo.modelo;

public class PromocionMes {
    private Producto producto;  // Producto principal de la promoción
    private double porcentajeDescuento;  // Porcentaje de descuento

    // Constructor de la promoción
    public PromocionMes(Producto producto, double porcentajeDescuento) {

        this.producto = producto;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    // Métodos getter

    public Producto getProducto() {
        return producto;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    // Método para calcular el precio con descuento
    public double calcularPrecioConDescuento() {
        return producto.getPrecio() * (1 - porcentajeDescuento / 100);
    }

    @Override
    public String toString() {
        return "Promoción " +": " + producto + ", Descuento: " + porcentajeDescuento + "%";
    }
}