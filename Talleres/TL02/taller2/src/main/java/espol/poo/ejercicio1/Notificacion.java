package espol.poo.ejercicio1;

public class Notificacion {

    private String mensaje;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }

    public void enviar() {

        System.out.println("Enviando notificación: " + this.mensaje);
    }
    
    public String getMensaje() {
        return mensaje;
    }
}