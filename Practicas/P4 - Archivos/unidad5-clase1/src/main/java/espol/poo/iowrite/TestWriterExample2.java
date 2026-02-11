/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.iowrite;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Gladys
 */

public class TestWriterExample2 {
 
    public static void main(String[] args) {
        try {
            String path = "archivos/miarchivo2.txt";
            //String path =  System.getProperty("java.class.path") + "/archivos/miarchivo1.txt";
       
            FileWriter writer = new FileWriter(path);//true significa que escribe al final del archivo
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}
