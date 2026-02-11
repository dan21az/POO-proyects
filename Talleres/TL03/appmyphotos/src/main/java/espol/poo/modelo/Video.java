package espol.poo.modelo;

public class Video extends Archivo{

  private int duracion;

  public Video(String nombre, String fecha, int tam, int duracion) {
    super(nombre, fecha, tam);
    this.duracion=duracion;
  }

  @Override
  public String toString() {
    return "Video "+super.toString() + " Duracion:" + duracion;
  }
}