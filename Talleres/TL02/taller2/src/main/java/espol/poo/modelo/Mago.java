package espol.poo.modelo;

public class Mago extends Personaje{

    public Mago(String n, int v, int a, int d) {
        super(n, v, a, d);
    }

    @Override
    public void usarEstrategia(){
        ataque = ataque+5;
    }

     
}