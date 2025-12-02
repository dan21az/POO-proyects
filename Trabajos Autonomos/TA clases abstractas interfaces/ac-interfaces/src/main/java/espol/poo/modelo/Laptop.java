package espol.poo.modelo;
import espol.poo.interfaces.*;

public class Laptop extends Computadora implements Recargable{
    double consumoElectricidad;
    double nivelActual;//en amperios
    public static double cargaMaxima = 1000;//en amperios

    public Laptop(int numeroNucleos, double consumoElectricidad, double nivelActual) {
        super(numeroNucleos);
        this.consumoElectricidad = consumoElectricidad;
        this.nivelActual = nivelActual; 
    }


    @Override
    public void printDescription(){
        System.out.println("Laptop");
    }

    public void printDescription(String s){
        System.out.println(s);
    }

    public double getNivelBateria(){
        return nivelActual;
    }

    public double getEficienciaElectrica(){
        return consumoElectricidad/super.getNumeroNucleos();
    }
}
