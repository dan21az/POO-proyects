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
/*
public class Deportista extends Persona{
    String deporte;
    public Deportista(){
        super();
    }
}
*/


public class Deportista extends Persona{
    String deporte;
    public Deportista(){
        System.out.println("Constructor de deportista");
    }
    public Deportista(String nombre) {
        
        super(nombre);
        System.out.println("aaa");
        
    }
    public Deportista(String nombre,String deporte) {
        this.deporte = deporte;
    }
    public void mostrar(){
        System.out.println("Informacion"+this.nombre);
    }
}
