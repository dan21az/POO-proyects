/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.ioread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import espol.poo.modelo.Direccion;
import espol.poo.modelo.Estudiante;

/**
 *
 * @author Gladys
 */
public class TestFile3 {
    public static void main(String[] args) throws IOException{
   
       
        //String path = "archivos/estudiantes.txt";
        //se crea una lista de estudiantes
        ArrayList<Estudiante> listaEst = new ArrayList<>();
        String path =  System.getProperty("java.class.path") + "/archivos/estudiantes.txt"; // Pot si no funciona, ests busca en el proyecto
        System.out.println(path);
         try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      
            String line="";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                //separar los datos del estudiante
                String[] datos = line.split(",");
                //crear objeto Direccion
                Direccion dir = new Direccion(datos[2], Integer.valueOf(datos[3]), datos[4]);
                Estudiante est = new Estudiante(datos[0], datos[1],dir);
                listaEst.add(est);
            }
           
 
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }
        //muestro la lista
        System.out.println(listaEst);

    }
}
