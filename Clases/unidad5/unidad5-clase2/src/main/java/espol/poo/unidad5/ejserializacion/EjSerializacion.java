/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.unidad5.ejserializacion;

import espol.poo.unidad5.modelo.Direccion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import espol.poo.unidad5.modelo.Estudiante;

/**
 *
 * @author Gladys
 */
public class EjSerializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        //ejemplo para crear un archivo con un objeto serializado 
        FileOutputStream fout = null;
        try {

            Estudiante objEstudiante = new Estudiante("202312345", "Maria Lopez","12345");
            objEstudiante.setDireccion(new Direccion("av",23,"calle"));
            System.out.println(objEstudiante);
            //String path =  System.getProperty("java.class.path") + "/archivos/202312345.ser";
            String path =  "archivos/202312345.ser";
            fout = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(objEstudiante);
            out.flush();

        } catch (IOException ex) {
           System.err.println(ex.getMessage());
           ex.printStackTrace();
        } finally {
            try {
                fout.close();
            } catch (IOException ex) {
                 System.err.println("Error al cerrar archivo");
            }
        }

 
        System.out.println("DESERIALIZACION/////");
        //ejemplo para leer
        ObjectInputStream in=null;
        try {
            //String path =  System.getProperty("java.class.path") + "/archivos/202312345.ser";
            String path =  "archivos/202312345.ser";
            in = new ObjectInputStream(new FileInputStream(path));
            Estudiante s = (Estudiante) in.readObject();
            System.out.println(s);
            in.close();
        } catch (FileNotFoundException ex) {
             System.err.println("No se encuentra archivo");
        } catch (IOException ex) {
           System.err.println("Error"+ex.getMessage());
        } catch (ClassNotFoundException ex) {
           System.err.println("Error"+ex.getMessage());
        }
       
    }

}
