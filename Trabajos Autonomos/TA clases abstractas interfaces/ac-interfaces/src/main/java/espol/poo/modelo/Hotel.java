package espol.poo.modelo;
import espol.poo.interfaces.*;

public class Hotel implements HuellaElectrica, Comparable<Hotel>{
    int numHuespedes;
    double consumoElectricidad;
    public Hotel(int numHuespedes, double consumoElectricidad) {
        this.numHuespedes = numHuespedes;
        this.consumoElectricidad = consumoElectricidad;
    }

    public double getEficienciaElectrica(){
        return consumoElectricidad;
    }

    @Override
    public int compareTo(Hotel otro){
        return Integer.compare(numHuespedes, otro.numHuespedes);
    }

    @Override
    public String toString(){
        return numHuespedes+" huespedes "+consumoElectricidad+" consumo";
    }

}

