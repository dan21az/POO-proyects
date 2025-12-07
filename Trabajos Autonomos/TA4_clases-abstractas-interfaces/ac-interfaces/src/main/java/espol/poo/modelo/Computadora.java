package espol.poo.modelo;
import espol.poo.interfaces.*;

abstract class Computadora implements HuellaElectrica{
    private int numeroNucleos;

    public Computadora(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }

    public void printDescription() {
        System.out.println("Computadora");
    }

    public int getNumeroNucleos(){
        return numeroNucleos;
    }

}
