/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.herencia;

/**
 *
 * @author Gladys
 */
public class Carro extends Vehiculo{ //Carro es un vehiculo
    private Motor motor; //carro tiene un motor
    public void mover(double km){
        System.out.println("Moviendose "+km+" kilometros");
    }
            
}
