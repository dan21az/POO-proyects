package espol.poo.modelo;

public class Repartidor {
    private String nombre;
    private double capacidadCargaMaxKg;

    //Constructor requerido
    public Repartidor(String n,double ccMax){
        this.nombre = n;
        this.capacidadCargaMaxKg = ccMax;
    }

    //Metodo asignar paquete
    public void asignarPaquete(Paquete paquete){
        boolean estado = paquete.getAsignado();
        String codigo = paquete.getCodigo();
        double peso = paquete.getPesoKG();
        if (estado){ //Vertificar si esta asignado
            System.err.println("Paquete "+codigo+" ya se encuentra asignado.");
        } else {
            if (peso<=capacidadCargaMaxKg){ //Verificar que no exceda el peso
                paquete.asignarPaquete();
                paquete.actualizarEstado("En Ruta");
                System.err.println("Paquete "+codigo+" asignado exitosamente. ");
            } else{
                System.err.println("Paquete "+codigo+" excede la capacidad máxima de "+capacidadCargaMaxKg+", no puede ser llevado por el repartidor "+nombre+".");
            }
        }
    }
}
