package espol.poo.micosecha.modelo;

public class Personaje {

    private String nombre;
    private int puntosGanados;
    private boolean esPrincipal;
    
    
    public Personaje(String nombre, boolean esPrincipal){
        this.nombre = nombre;
        this.esPrincipal = esPrincipal;
    }
    
    public Personaje(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public int getPuntosGanados() {
        return puntosGanados;
    }

    public boolean isEsPrincipal() {
        return esPrincipal;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Puntos Ganados: "+puntosGanados);
        System.out.println("Es principal?; "+esPrincipal);
    }
    
    public void recolectar(Fruta fruta){
        
    }
    
}