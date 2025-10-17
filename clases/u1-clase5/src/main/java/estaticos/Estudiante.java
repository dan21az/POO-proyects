package estaticos;

/**
 *
 * @author Gladys
 */

public class Estudiante {
    private String nombre; //variable de instancia, valor por defecto null
    private int codigo; //variable de instancia, valor por defecto 0
    public static int counter;//variable de clase,todos los objetos comparten 
                               
    private static final double passGrade=6.0;//constante, compartida, no cambia
    
    /**
     * Constructor vacio
     */
    public Estudiante(){
    }
    
    /**
     * Constructor de la clase Estudiante
     * @param nombre : nombre del Estudiante
     */
    public Estudiante(String nombre){
        this.nombre = nombre;
        this.codigo = counter+1;
        counter++;
    }

    /**
     * Metodo que muestra los valores de las variables del objeto
     */
    public void mostrarInformacion(){
        System.out.println("Nombre = "+nombre);
        System.out.println("Codigo = "+codigo);
        System.out.println("Counter = "+counter);
    }
    
    
    public static void modificarCounter(int value){
        counter = value;
    }
    /* 
    public static void modificarNombre(String nombre){
        this.nombre = nombre;
    }*/
    
    public void test1(){
        modificarCounter(0); 
    }/*
    public static void test2(){
        test1(); 
    } */
    public static void test3(){
        modificarCounter(0); 
    }
}

