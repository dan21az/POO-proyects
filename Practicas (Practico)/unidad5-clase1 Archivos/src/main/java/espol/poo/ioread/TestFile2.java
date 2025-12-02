/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.ioread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gladys
 */
public class TestFile2 {
    public static void main(String[] args) {
        
        String path = "archivos/estudiantes.txt";
        //String path =  System.getProperty("java.class.path") + "/archivos/estudiantes.txt";
        BufferedReader bufferedReader =null;
       
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                System.out.println("xxxx");
                
            }
           
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        }
         catch (IOException e) {
            System.out.println(e);
        }finally{
            try{
               
                bufferedReader.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    

    }
}
