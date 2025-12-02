package espol.poo.modelo;

public class Personaje {
    private String nombre;
    protected int vida;
    protected int ataque;

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    protected int defensa;

    public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre(){
        return nombre;
    }

    // Método genérico de realizar ataque
    // llama al metodo usarEstrategia del personaje
    // y envía el ataque al objetivo
    public void realizarAtaque(Personaje objetivo) {
        // Activar la estrategia antes de atacar
        this.usarEstrategia();
        // Enviar el ataque directamente al objetivo
        System.out.println(nombre + " ataca " + objetivo.getNombre());
        objetivo.recibirAtaque(this.ataque);  // Pasamos el valor de ataque directamente

    }

    public boolean estaVivo(){
        return vida>0;
    }

    // Método para definir la estrategia del personaje
    public void usarEstrategia(){
        ataque = ataque;
    }

    public void recibirAtaque(int dano) {
     //COMPLETAR DE ACUERDO A LAS INSTRUCCIONES
     int danoReal = dano - defensa;
     if(danoReal<0){
        danoReal = 0;
     } else{
        if((vida - danoReal)<=0){
            vida = 0;
        } else {
            vida = vida - danoReal;
        }
     }
     System.out.println(nombre + " recibe " + danoReal+ " de daño. Vida Restanta: " + vida);
    }


    
}
