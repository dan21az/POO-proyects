package espol.poo.avis;

public class CarroTurismo extends Vehiculo {

    private int numPasajero;

    public CarroTurismo(String placa) {
        super(placa);
    }

    public CarroTurismo(String placa, String marca, int precio, int numPasajero) {
        super(placa, marca, precio);
        this.numPasajero = numPasajero;
    }

    public int getNumPasajero() {
        return numPasajero;
    }

    public void setNumPasajero(int numPasajero) {
        this.numPasajero = numPasajero;
    }

    @Override
    public String toString() {
        return "CarroTurismo{ " + super.toString() + " ,numPasajero=" + numPasajero + '}';
    }

  public void darMantenimiento(){
    System.out.println("Dando mantenimiento al Carro");
  }


}
