/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.constructores2;

/**
 *
 * @author Gladys
 */
public class TestPersona {
    public static void main(String[] args) {
        Deportista d3 = new Deportista();
        Persona p1 = new Persona("Pablo");//utilizo el constructor con parametos
        Deportista d1 = new Deportista("Messi");

        System.out.println(p1.getNombre());
        System.out.println(d1.getNombre());
        
        Deportista d2 = new Deportista("Suarez","futbol");

        System.out.println(d2.getNombre());
        
    }
}
