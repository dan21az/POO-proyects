package espol.poo.ejercicio1;

public class SMSNotificacion extends Notificacion {
    
    private String numeroTelefono;


    public SMSNotificacion(String mensaje, String numeroTelefono) {
        super(mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar() {

        System.out.println("**Enviando SMS a " + this.numeroTelefono + ":** " + this.getMensaje());
    }

    // Método Único 
    public void verificarEntrega() {
        System.out.println("    -> Verificando estado de entrega del SMS a " + this.numeroTelefono + "...");
    }
}