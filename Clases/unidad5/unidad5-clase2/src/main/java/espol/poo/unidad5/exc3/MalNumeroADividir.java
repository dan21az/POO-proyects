/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.unidad5.exc3;

/**
 *
 * @author Gladys
 */

public class MalNumeroADividir extends Exception {
    public MalNumeroADividir (String msg){
        super(msg);
    }
    public MalNumeroADividir () {
        super("No es posible dividir entre cero");   
    }
}
