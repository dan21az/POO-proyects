package espol.poo.u1.clase5.modelo;


public class Restaurante {
  String nombre;
  boolean servicioDomicilio;

  public Restaurante()
  {
    //nombre="";
  }

  public Restaurante(String nombre) {
     //   this(nombre,true);//esta linea hace lo mismo que las dos siguientes
    this.nombre = nombre;
    servicioDomicilio = true;

  }

  public Restaurante(String nombre, boolean servicioDomicilio) {
    this.nombre = nombre;
    this.servicioDomicilio = servicioDomicilio;

  }

  public void procesarPedido(String pedido, Cliente cl) {

    System.out.println("Procesando pedido " + pedido + " del cliente "+ cl.getNombre());
  }


  public void procesarPedido(Comida comida, Cliente cl) {

    System.out.println("Procesando pedido " + comida + " del cliente "+ cl.getNombre());
  }
}

