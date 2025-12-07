package practica_herencia.modelo;


public class Turismo extends Vehiculo {
    private int numPasaj;

    public Turismo(String pl, String m, float pr, int numPasaj) {
        super(pl, m, pr);
        this.numPasaj = numPasaj;
    }
    
    public String toString(){
        return "Tipo: Turismo\n" +super.toString() + "\nNúmero de Pasajeros: " + numPasaj;
                
    }

}
