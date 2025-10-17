
package espol.poo.modelo;


public class Factura {
    String fecha;
    public double total;

    public Factura() {
    }

    public Factura(String fecha, int total) {
        this(total);
        this.fecha = fecha;

    }

    public Factura(double total) {
        this.total = total;
    }

    public void metodo1(String nombre, int valor){
        metodo1(nombre,"");
    }

    public void metodo1(String nombre, String valor){
        
    }

    private void metodo1(int n, String v){

    }
    public String metodo1(String n){
        return "";
    }
        
    public double getTotal() {
        return total;
    }
}
