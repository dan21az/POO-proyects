package espol.poo.modelo;

public class Paquete {
    private String codigo;
    private double pesoKG;
    private String estadoEnvio;
    private boolean asignado;

    //Contructor requerido
    public Paquete(String codSeguimiendo, double peso){
        this.codigo = codSeguimiendo;
        this.pesoKG = peso;
        this.estadoEnvio = "Pendiente";
        this.asignado = false;
    }

    //Metodos requeridos
    public void actualizarEstado(String nuevoEstado){
        if (nuevoEstado.equals("Pendiente")||nuevoEstado.equals("En ruta")||nuevoEstado.equals("Entregado")){
            this.estadoEnvio = nuevoEstado;
        }
    }

    public void asignarPaquete(){
        this.asignado=true;
    }

    public void mostrarDetalles(){
        String estado;
        if (asignado){ //Convertir valor boleano de estado a "Asignado" o "No asignado"
            estado = "Asignado";
        } else {
            estado = "No Asignado";
        }
        System.err.println("Paquete [código="+codigo+", pesoKg="+pesoKG+", estadoEnvio="+estadoEnvio+" -"+estado+"] ");
    }

    //Getters
        public String getCodigo() {
        return codigo;
    }

    public double getPesoKG() {
        return pesoKG;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public boolean getAsignado() {
        return asignado;
    }

}

