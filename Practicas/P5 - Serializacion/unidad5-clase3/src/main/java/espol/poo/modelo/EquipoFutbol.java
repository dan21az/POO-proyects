package espol.poo.modelo;

import java.io.Serializable;

public class EquipoFutbol implements Serializable {
    private String nombre;
    private String abrev;

    public EquipoFutbol (String nombre, String abrev) {
        this.nombre = nombre;
        this.abrev = abrev;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAbrev() {
        return abrev;
    }

    @Override
    public String toString() {
        return  abrev ;
    }
    
}
