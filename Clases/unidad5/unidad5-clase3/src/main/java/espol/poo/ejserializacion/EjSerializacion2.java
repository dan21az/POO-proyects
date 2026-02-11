/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.ejserializacion;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import espol.poo.modelo.Direccion;
import espol.poo.modelo.Estudiante;

/**
 *
 * @author Gladys
 */
public class EjSerializacion2 {

    public static void main(String[] args) {
       // String path =  System.getProperty("java.class.path") + "/archivos/estudiantes.txt";
        String path =  "archivos/estudiantes.txt";
    
        ArrayList<Estudiante> st = new ArrayList<>();
       
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String[] datos = sCurrentLine.split(",");
                Direccion d = new Direccion(datos[2], Integer.valueOf(datos[3]), datos[4]);
                Estudiante est = new Estudiante(datos[0], datos[1], d);
                st.add(est);
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(st);

        //SERIALIZAR LA LISTA
        //path =  System.getProperty("java.class.path") + "/archivos/listaEstudiantes.ser";
        path =  "archivos/listaEstudiantes.ser";
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(st);
            out.flush();
        } catch (IOException ex) {
            System.out.println("IOException:" + ex.getMessage());
        } finally {
            
        }
 
 
        //path =  System.getProperty("java.class.path") + "/archivos/listaEstudiantes.ser";

        System.out.println("deserializar la lista");
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
   
            ArrayList<Estudiante> s = (ArrayList<Estudiante>)in.readObject();// hay que hacer casting
            System.out.println(s);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException:" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException:" + ex.getMessage());
        }catch (Exception ex) {
            
        }

    }
}
