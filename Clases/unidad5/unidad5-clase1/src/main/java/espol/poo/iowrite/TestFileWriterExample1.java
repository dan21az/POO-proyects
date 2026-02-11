/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.iowrite;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gladys
 */

public class TestFileWriterExample1 {
    public static void main(String[] args) {
       String path = "archivos/miarchivo1.txt";
       // String path =  System.getProperty("java.class.path") + "/archivos/miarchivo1.txt";
        FileWriter writer = null;
        try {
            writer = new FileWriter(path,true);//true hace append
            writer.write("Hello World 123");
            writer.write("\nNuevo contenido\n");   // write new line
            writer.write("Good Bye!");
           
        } catch (IOException e) {
            
            e.printStackTrace();
        }finally{
             try {
                writer.close();
             } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
             }
        }
    }
}
