package espol.poo.iowrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriterExample3 {

    public static void main(String[] args) {
        String path = "archivos/miarchivo1.txt";
        //String path =  System.getProperty("java.class.path") + "/archivos/miarchivo1.txt";
       
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true));) {          
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}
