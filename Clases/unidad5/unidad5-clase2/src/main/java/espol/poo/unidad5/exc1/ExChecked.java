package espol.poo.unidad5.exc1;

import java.io.FileWriter;
import java.io.IOException;

public class ExChecked {
    public static void main(String[] args) {
        System.out.println("Checked");


        try {
            FileWriter fw1 = new FileWriter("archivo.txt");
            //
            int b = 0 ;
            System.out.println(5 / b);

        }

        catch (IOException ex) {
            System.out.println("Error de ejecucion" + ex);
        }
        catch (ArithmeticException ex) {
            System.out.println("Error de ejecucion");
        }
        catch (Exception ex) {
            System.out.println("Error de ejecucion");
        }


    }
}
