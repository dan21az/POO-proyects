package espol.poo.interfaces;

public interface Recargable{

    double getNivelBateria();


    default double calcularMinimo(){
        return 100;
    }

    static double calcularPorcentaje(double nivelActual, double nivelMaximo){
        return nivelActual/nivelMaximo;
    }
    
    /*
    1. ¿Cuál es la ventaja de dar una implementación predeterminada al nuevo método de la interfaz calcularMinimo?
    Porque permite añadir a las clases hijas escoger entre usar la implementación de la interfaz o sobreescribirla según sus necesidades.
    2. ¿Por qué calcularPorcentaje es un buen candidato a ser un método estático? 
    Porque su funcionamiento no depende de las variables de instancia, se introduce los datos en los parametros.
    */

}