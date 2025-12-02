package espol.poo.micosecha.modelo;

public class Fruta {
    private String nombre;
    private int calorias;
    
    public Fruta(String nombre, int calorias){
        this.nombre = nombre;
        this.calorias = calorias;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public int getcalorias(){
        return calorias;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Calorias: "+calorias);
    }
}