package espol.poo.modelo;



public class ExcedeCapacidad extends Exception {

    public ExcedeCapacidad(){
        // super("Excede capacidad de almacenamiento"); Creo que debería ir esto en el constructor
    }

    public String toString(){
        return "Excede capacidad de almacenamiento"; //Para que solo se muestre esto al ejecutarse, como en el resultado esperado
    }
}
