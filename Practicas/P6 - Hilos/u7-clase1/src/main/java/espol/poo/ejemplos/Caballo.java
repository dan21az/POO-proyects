package espol.poo.ejemplos;


public class Caballo extends Thread {
    private String nombre;
    private int distanciaRecorrida;

    public Caballo(String nombre) {
        this.nombre = nombre;
    }
    //complete el código necesario para que el caballo sea un hilo

    @Override
    public void run() {
        while (distanciaRecorrida < 1600) {

            int num = (int) (Math.random() * 100);
            distanciaRecorrida += num;

            System.out.println(nombre + " Distancia Recorrida: " 
                    + distanciaRecorrida + " m");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombre + " ha llegado a la meta!");

    }
    

}

