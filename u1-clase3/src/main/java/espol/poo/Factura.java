package espol.poo;

public class Factura {
    String fecha;
    double total;

    public Factura() {
    }

    public Factura(double total) {
        this.total = total;
    }

    public Factura(String fecha, double total) {
        this.fecha = fecha;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
