package espol.poo.modelo;


public class Cliente {
    private String nombre;
    private int porcDescuento;
    private boolean esAfiliado;

    public int getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(int porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

    public boolean isEsAfiliado() {
        return esAfiliado;
    }

    public void setEsAfiliado(boolean esAfiliado) {
        this.esAfiliado = esAfiliado;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public Cliente(){

    }

    public Cliente(String nombre, boolean esAfiliado, int p){  
        this(nombre, esAfiliado);
        porcDescuento =2;
    }

    public Cliente(String nombre, boolean esAfiliado){
        this.nombre = nombre;
        this.esAfiliado = esAfiliado;
        if (esAfiliado){
            porcDescuento = 5;
        }
    }
    
    public void revisarMenu(){
        Factura f = new Factura(30);
        System.out.println("Cliente " + nombre + " revisa el menu");
    }
    public boolean pagar(double valor){
        System.out.println("Cliente " + nombre + " paga: " + valor);
        return true;
    }

    public double pagarFactura(Factura factura){
        System.out.println("Cliente " + nombre + " paga total factura: " + factura.getTotal());
        return factura.getTotal();
    }


    
}