package espol.poo.appejemplo1.modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Empleado {
    public static final String nomArchivo = "empleados.csv";

    private String cedula;
    private String nombre;

    public Empleado(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }


    public static boolean crearDatosIniciales(File directorio) throws Exception{
        File f = new File(directorio, nomArchivo);
        //se escribe la lista serializada
        if (! f.exists()) { //si no existe se crea con datos de prueba
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
                // 3. Write content to the file
                writer.write("0987654321,Luis Calle");
                writer.newLine(); // Add a platform-independent new line

            } catch (IOException e) {
                throw e;
            }
        }
        return true;
    }


    public static boolean guardarEmpleado(String cedula, String nombre, File directorio) throws Exception{
        String ruta = directorio + "/" + nomArchivo;
        //File f = new File(directorio, nomArchivo); //se puede usar también el objeto File
        //se escribe la lista serializada

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta,true))) { //se puede cambiar ruta por f
                // 3. Write content to the file
                writer.write(cedula + ","+ nombre);
                writer.newLine(); // Add a platform-independent new line

            } catch (IOException e) {
                throw e;
            }

        return true;
    }
}
