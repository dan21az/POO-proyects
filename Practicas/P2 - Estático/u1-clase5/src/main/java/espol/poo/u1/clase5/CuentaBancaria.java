/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.u1.clase5;

/**
 *
 * @author Gladys
 */

public class CuentaBancaria {
    //declarar variable estática para el prox número
    static int proxNumero = 1001;
    public  static  final  double  pi = 3.1416; //"final" se usa para crear variables, evita que se pueda cambiar su valor.
  
    // variables de instancia
    int numero;
    double balance;

    //metodo estático, solo usar variables estáticas
    public static void incrementar(){
        proxNumero++;
       
    
    }
    public CuentaBancaria(){
        numero = proxNumero;//se asigna
        proxNumero++;//se incrementa
    }
    public static void main(String[] args) {
        //crear objeto
        CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancaria c2 = new CuentaBancaria();
        System.out.println(c1.numero);//ver numero para cuenta 1
        System.out.println(c2.numero);//ver numero para cuenta 2
        System.out.println(CuentaBancaria.proxNumero);
        CuentaBancaria.incrementar();
    }
}