package espol.poo.modelo;
import espol.poo.interfaces.*;


public class PowerBand implements Recargable{
    String marca;
    double nivelActual;
    static int cargaMaxima = 500;

    public static int getCargaMaxima() {
        return cargaMaxima;
    }

    public PowerBand(String marca, double nivelActual) {
        this.marca = marca;
        this.nivelActual = nivelActual;
    }

    public double getNivelBateria(){
        return nivelActual;
    }

    public double calcularMinimo(){
        return 50;
    }
    
}