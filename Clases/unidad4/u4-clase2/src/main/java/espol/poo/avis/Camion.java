package espol.poo.avis;
public class Camion extends Vehiculo{
    private int capacidadCarga;
    private boolean sisRefrigeracion;
        public Camion(String placa) {
        super(placa);
    }
  
    public Camion(String placa, String marca, int precio, int capacidadCarga, boolean sisRefrigeracion) {
        super(placa, marca, precio);
        this.capacidadCarga = capacidadCarga;
        this.sisRefrigeracion = sisRefrigeracion;
    }
    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public boolean getSisRefrigeracion() {
        return sisRefrigeracion;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void setSisRefrigeracion(boolean sisRefrigeracion) {
        this.sisRefrigeracion = sisRefrigeracion;
    }



    public String toString() {
        return "Camion{" +super.toString()+ " ,capacidadCarga=" + capacidadCarga + ", sisRefrigeracion=" + sisRefrigeracion + '}';
    }
     
    public double cotizarVehiculo(int dias){
        double valor =  super.cotizarVehiculo(dias);
        if (sisRefrigeracion)
            valor+=50;
        return valor;
    }
  public void darMantenimiento(){
    System.out.println("Dando mantenimiento al Camion");
  }


}