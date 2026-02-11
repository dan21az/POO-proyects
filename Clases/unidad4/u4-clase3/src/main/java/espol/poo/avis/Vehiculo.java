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
   //método abstracto
   public abstract void darMantenimiento();

    public String getPlaca() {
        return placa;
    }

    
    public double cotizarVehiculo(int dias){
        return dias * precio;
    }

    @Override
    public String toString() {
        return "placa=" + placa + ", marca=" + marca + ", precio=" + precio ;
    }




   public boolean equals(Object o){

     if (this==o) return true;
     if (o!=null && o instanceof Vehiculo){
       Vehiculo v = (Vehiculo)o;
       return this.placa.equals(v.placa);
     }
     return false;
     
   }
}
