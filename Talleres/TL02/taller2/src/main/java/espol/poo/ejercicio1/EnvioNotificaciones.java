package espol.poo.ejercicio1;


import java.util.ArrayList;


public class EnvioNotificaciones {

    public static void main(String[] args) {
        
        // 1. Crear una lista de la Superclase (Notificacion)
        System.out.println("***** INICIANDO PROCESAMIENTO DE NOTIFICACIONES *****\n");
        ArrayList<Notificacion> notificacionesPendientes = new ArrayList<>();

        // 2. Instanciar y agregar objetos de las Subclases (Polimorfismo)
        notificacionesPendientes.add(new EmailNotificacion("Tu pedido ha sido enviado.", "juan.perez@tienda.com"));
        notificacionesPendientes.add(new SMSNotificacion("Su cita es mañana a las 10:00.", "555-1234"));
        notificacionesPendientes.add(new Notificacion("Sistema en mantenimiento programado."));
        notificacionesPendientes.add(new EmailNotificacion("Nueva actualización de política de privacidad.", "clientes@empresa.com"));
        notificacionesPendientes.add(new SMSNotificacion("Código de verificación: 7890.", "555-5678"));
        procesarNotificaciones(notificacionesPendientes);

    }
    public static void procesarNotificaciones(ArrayList<Notificacion> notificacionesPendientes){
        System.out.println("----------------------------------------------------\n");
        //COMPLETAR DE ACUERDO A LAS INSTRUCCIONES
        for(Notificacion notificacion : notificacionesPendientes ){
            notificacion.enviar();
            if(notificacion instanceof EmailNotificacion){
                EmailNotificacion email = (EmailNotificacion) notificacion;
                email.adjuntarArchivo("Factura-001.pdf");
            } else if(notificacion instanceof SMSNotificacion){
                SMSNotificacion sms = (SMSNotificacion) notificacion;
                sms.verificarEntrega();
            }
        }
        System.out.println("\n----------------------------------------------------\n");
     
        System.out.println("***** PROCESAMIENTO TERMINADO *****");
    }
}