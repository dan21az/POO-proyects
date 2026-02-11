/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.constructores1;

/**
 *
 * @author Gladys
 */
public class TestPersona {
    public static void main(String[] args) {
       
        Persona p1 = new Persona();//el constructor no existe, java lo crea
        System.out.println(p1.getNombre());
        Deportista d1 = new Deportista();//el constructor no existe, java lo crea
        p1.setNombre("Pablo");
        System.out.println(p1.getNombre());
        d1.setNombre("Messi");
        System.out.println(d1.getNombre());
        
    }
}
