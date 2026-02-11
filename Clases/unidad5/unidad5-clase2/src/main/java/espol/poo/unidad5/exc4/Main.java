/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.unidad5.exc4;

/**
 *
 * @author Gladys
 */

class Prueba extends Exception { 

}
  
class Main {
   public static void main(String args[]) {
       

       
      try {
         throw new Prueba();
      }
      catch(Prueba t) {
         System.out.println("Se obtiene Prueba Exception");
      }
      finally {
         System.out.println("En bloque final ");
      }
  }
}
