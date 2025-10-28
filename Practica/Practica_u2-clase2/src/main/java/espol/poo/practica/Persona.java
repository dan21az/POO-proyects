package espol.poo.practica;

public class Persona {
    String nombre;
    float altura;
    //Constructores
    public Persona() {
    }
    public Persona(String nombre, float altura) {
        this.nombre = nombre;
        this.altura = altura;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public float getAltura() {
        return altura;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}

