package espol.poo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    /* PARTE 4

    Computadora c1 = new Computadora(8);
    c1.printDescription();
        Error, la clase Computadora es abstracta y no puede ser instanciada.

    Computadora c2 = new Laptop(4,1000,89);
    c2.getConsumoElectrico();
        Error, la clase de referencia Computadora no tiene el método getConsumoElectrico.

    Computadora c3 = new Laptop(4,100,45);
    c3.printDescription(“Laptop”);
        Error, la clase de referencia Computadora no tiene un método pinrtDescription con parámetro String.

    Computadora c4 = new Laptop(1,100,799);
    c4.printDescription();
        Compila e Imprime Laptop.

    HuellaElectrica e1 = new HuellaElectrica();
    e1.getEficienciaElectrica();
        Error, las interfaces no pueden instanciarse.

    HuellaElectrica e2 = new Hotel(100,9000);
    e2.getEficienciaElectrica();
        Compila e Imprime 9000

    HuellaElectrica e3 = new Laptop(1,100,799);
    e3.getNivelBateria();
        Error, la interfaz HuellaElectrica no tiene un método getNivelBateria

    */

    /* PARTE 5 REFLEXIÓN
    
    1. La clase Computadora es abstracta, ¿Por qué debe ser abstracta para que el código compile? 
    Debe ser abstracta ya que implementa la interfaz HuellaElectrica pero no implementa su método abstracto getEficienciaElectrica,
    lo que hace olbigatorio implementarlo o que la clase sea abstracta
    2. ¿Cuáles son los métodos que debe implementar Hotel para que pueda ser concreta?
    Debe implementar getEficienciaElectrica ya que es un método abstracto de HuellaElectrica, mientras que compareTo y toString son sobreescritos.
    3. ¿Cuáles son los métodos que debe implementar Laptop para que pueda ser concreta?
    Debe implementar getEficienciaElectrica ya que es un método abstracto de la interfaz HuellaElectrica que implementa la clase Computadora que es padre de la clase Laptop, 
    y getNivelBateria ya que es método abstracto de la implementaciones Recargable que implementa la clase Laptop. 
    4. ¿Por qué el parámetro recibido por el método esEficiente es de tipo HuellaElectrica?
    Porque Huella digital puede implementarse en otras clases que representen objetos que se le puedan aplicar conceptos de Eficiencia,
    5. ¿Qué método debe implementar PowerBand para que sea concreta?
    getNivelBateria ya que es un método abstracto de la interfaz Recargable implementada en PowerBand.
    6. ¿Por qué Laptop no tiene que implementar el método calcularMinimo()?
    Porque en la interfaz Recargable, que se implementa en Laptop, tiene como default a calcularMinimo, 
    lo no hace obligatorio implementarla, puede sobreescribirlo o usarlo por defecto.

    */
    }

}