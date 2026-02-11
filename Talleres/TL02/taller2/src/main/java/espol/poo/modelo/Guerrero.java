package espol.poo.modelo;

public class Guerrero extends Personaje{
    private int fuerza;

    public Guerrero(String n, int v, int a, int d, int f){
        super(n, v, a, d);
        this.fuerza = f;
    }

    @Override
    public void usarEstrategia(){
        ataque = ataque * fuerza;
    }
    
}