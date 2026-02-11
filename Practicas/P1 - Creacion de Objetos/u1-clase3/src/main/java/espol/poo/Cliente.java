package espol.poo;

public class Cliente {
    String nombre;
    int porcDescuento;
    boolean esAfiliado;

    public void revisarMenu(){
        int valor=0;
        System.out.println("Cliente " + nombre + " revisa el menu " + valor);
    }
    public double pagarFactura(Factura factura){
        System.out.println("Cliente " + nombre + " paga total factura: " + factura.getTotal());
        pagar(factura.getTotal());
        return factura.getTotal();
    }
    public boolean pagar(double valor){
        System.out.println("Cliente " + nombre + " paga: " + valor);
        return true;
    }


        public Cliente(String nombre, boolean esAfiliado) {
        this.nombre = nombre;
        this.esAfiliado = esAfiliado;
        if(esAfiliado) {
            this.porcDescuento = 5;
        }
    }
}
