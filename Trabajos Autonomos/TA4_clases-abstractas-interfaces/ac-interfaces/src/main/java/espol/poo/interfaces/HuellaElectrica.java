package espol.poo.interfaces;

public interface HuellaElectrica {

    int LIMITECONSUMO = 100;
    double getEficienciaElectrica();
    default double getPolucion(){
        return 0;
    }
    
}