package com.example;
//Ejemplo de clases
public class DivisionSegura { 
    public static void main(String args[]){ 
	    int x = 12; 
	    int y = 2; 
	    int z = 0; 
	    if( y !=0 ) { 
	        z = x / y;
	    		System.out.println("El resultado es : " + z);
			} 
			else
	    		System.out.println("Atención! se pretende dividir por 0");
        }
 
}
