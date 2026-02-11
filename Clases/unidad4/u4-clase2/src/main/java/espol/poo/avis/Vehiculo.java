package espol.poo.avis;


public abstract class Vehiculo {

    private String placa;
    private String marca;
    private int precio;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public Vehiculo(String placa, String marca, int precio) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
    }

    public void setPlaca() {
        this.placa = placa;
    }

    public void setMarca() {
        this.marca = marca;
    }

    public void setPrecio() {
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }
    
    
    public double cotizarVehiculo(int dias){
        return dias * precio;
    }

    @Override
    public String toString() {
        return "placa=" + placa + ", marca=" + marca + ", precio=" + precio ;
    }

 
   public abstract void darMantenimiento();
   public boolean equals(Object o){
     System.out.println("en metodo equals");
     if (this==o) return true;
     if (o!=null && o instanceof Vehiculo){
       Vehiculo v = (Vehiculo)o;
       return this.placa.equals(v.placa);
     }
     return false;
     
   }
}
