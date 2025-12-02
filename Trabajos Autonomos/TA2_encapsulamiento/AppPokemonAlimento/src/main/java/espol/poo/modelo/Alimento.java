package espol.poo.modelo;

public class Alimento {
    private String nombre;
    private int valorNutricional;

    public Alimento(String nombre, int valorNutricional) {
        this.nombre = nombre;
        this.valorNutricional = valorNutricional;
    }

    public Alimento(String nombre) {
        this.nombre = nombre;
        this.valorNutricional = 10;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValorNutricional() {
        return valorNutricional;
    }
    
    public void mostrarAlimento() {
        System.out.println("Alimento: "+nombre );
        System.out.println("Valor nutricional: "+valorNutricional);
    }
}
