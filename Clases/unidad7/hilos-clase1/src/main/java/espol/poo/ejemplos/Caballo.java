package espol.poo.ejemplos;


//public class Caballo extends Thread{
public class Caballo implements Runnable {
    private String nombre;
    private int distanciaRecorrida;

    public Caballo(String nombre) {
        this.nombre = nombre;
    }
    //complete el código necesario para que el caballo sea un hilo
    public void run(){
        while (distanciaRecorrida < 1600){
            int num= (int) (Math.random() * 100);
            distanciaRecorrida+=num;
            System.out.println("[" + nombre + "]  Distancia recorrida: " + distanciaRecorrida + " m.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("[" + nombre + "] ha llegado a la meta");
    }

}

