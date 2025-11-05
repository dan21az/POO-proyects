package modelo;
import java.util.Random;

public class Servidor {
    private String nombre, ip, clave = "";
    private float disco, memoria;
    private int cantidadProcesador;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getCantidadProcesador() {
        return cantidadProcesador;
    }
    public void setCantidadProcesador(int cantidadProcesador) {
        this.cantidadProcesador = cantidadProcesador;
    }

    public float getDisco() {
        return disco;
    }
    public void setDisco(float disco) {
        this.disco = disco;
    }

    public float getMemoria() {
        return memoria;
    }
    public void setMemoria(float memoria) {
        this.memoria = memoria;
    }

    public void actualizarClave(){
        char[] letras= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z', '@', '_'};
        
        for(int i =0; i<=7; i++){
        Random rand = new Random();
        int n = rand.nextInt(letras.length);
        this.clave= clave+letras[n];
        }
    }

    public Servidor(String nombre, String ip, int cantidadProcesador, float disco, float memoria) {
        this.nombre = nombre;
        this.ip = ip;
        this.cantidadProcesador = cantidadProcesador;
        this.disco = disco;
        this.memoria = memoria;
        actualizarClave();
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("IP: "+ip);
        System.out.println("Clave: "+clave);
    }

}

