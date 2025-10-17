package espol.poo.juego;

public class Personaje {
    String nombre;
    int vida;
    int ataque;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Personaje enemigo) {
        System.out.println(this.nombre + " ataca a " + enemigo.nombre);
        enemigo.recibirDanio(this.ataque);
    }

    public void recibirDanio(int cantidad) {
        this.vida -= cantidad;
        System.out.println(this.nombre + " recibe " + cantidad + " de daño. Vida restante: " + this.vida);
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Vida: " + vida + ", Ataque: " + ataque);
    }
    
    public boolean estaVivo() {
        return this.vida > 0;
    }
}
