/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.ioread;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gladys
 */
public class TestFile1 {
    public static void main(String[] args) {
        
        //String path = "archivos/estudiante.txt";
        String path =  System.getProperty("java.class.path") + "/archivos/estudiantes.txt";
        try {
            FileReader reader = new FileReader(path);
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
                System.out.println("====");
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error"+e);
        }
    }

}
