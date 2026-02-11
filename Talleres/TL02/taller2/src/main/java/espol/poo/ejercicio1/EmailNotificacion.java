package espol.poo.ejercicio1;


public class EmailNotificacion extends Notificacion {

    private String destinatarioEmail;

    public EmailNotificacion(String mensaje, String destinatarioEmail) {
        super(mensaje); 
        this.destinatarioEmail = destinatarioEmail;
    }

    public void enviar() {
        System.out.println("**Enviando EMAIL a " + this.destinatarioEmail + ":** " + this.getMensaje());
    }

    // Método propio
    public void adjuntarArchivo(String nombreArchivo) {
        System.out.println("    -> Adjuntando " + nombreArchivo + " al email.");
    }
}