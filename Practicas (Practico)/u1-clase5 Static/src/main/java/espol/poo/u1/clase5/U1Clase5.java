/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espol.poo.u1.clase5;

import espol.poo.u1.clase5.modelo.*;

/**
 *
 * @author Gladys
 */
public class U1Clase5 {

    public static void main(String[] args) {
        System.out.println("Creando objetos:");
        //creando objetos
        //Cliente cl1 = new Cliente();//esta linea da error porque ese constructor no existe
        Cliente cliente1 = new Cliente("Luis");
        
        Restaurante rest1 = new Restaurante("Dominos");
        Restaurante rest2 = new Restaurante("pizza hut", true);
    
        rest1.procesarPedido("Hamburguesa",cliente1);
        Comida comida = new Comida("Pizza personal",4.5f);
        rest2.procesarPedido(comida, cliente1);

        cliente1.setNombre( "Pepe");
  
        Cliente cliente2 = new Cliente("Margarita",true);
    
        //llamando a  metodos
        cliente1.revisarMenu();
        cliente2.pagar(30);
    
    
        
        //llamada a metodo sobrecargado
        cliente2.mostrarSaludo();
    
        cliente2.mostrarSaludo("Estoy feliz");
        cliente2.mostrarSaludo("Me gusta programar",3);
    
    
        
    
        //los atributos private de la clase cliente no son accesibles desde otra clase directamente, la siguiente linea da error
        //System.out.println(cliente2.nombre);
    
        //para acceder debo usar los getters
        //System.out.println(cliente2.getNombre());
    
        //uso de método estático
        int maximo = Math.max(23, 45);
        System.out.println("Maximo entre 23 y 45: "+ maximo);
    }
}
