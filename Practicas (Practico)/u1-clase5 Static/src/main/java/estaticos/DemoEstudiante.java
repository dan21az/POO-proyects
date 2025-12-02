/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estaticos;

/**
 *
 * @author Gladys
 */

public class DemoEstudiante {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Abigail");
        est1.mostrarInformacion();
        Estudiante est2 = new Estudiante("Carlos");
        est2.mostrarInformacion();


        Estudiante.modificarCounter(5);
        
        est1.mostrarInformacion(); //mostrar informacion de estudiante
 

  }
}
