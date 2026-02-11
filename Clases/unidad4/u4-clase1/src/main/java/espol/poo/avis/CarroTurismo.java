package espol.poo.avis;

public class CarroTurismo extends Vehiculo{
    private int numPasaj;

    public CarroTurismo(String placa, String marca, float precio, int numPasaj) {
        super(placa, marca, precio);
        this.numPasaj = numPasaj;
    }


}
