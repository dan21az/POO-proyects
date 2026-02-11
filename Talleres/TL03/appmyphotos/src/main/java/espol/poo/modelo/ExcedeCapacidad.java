package espol.poo.modelo;



public class ExcedeCapacidad extends Exception {

    public ExcedeCapacidad(){

    }

    public String toString(){
        return "Excede capacidad de alamcenamiento";
    }
}
