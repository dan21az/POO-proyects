package espol.poo.modelo;

public class Foto extends Archivo{
  
  private TipoFormato formato;

  public Foto(String nombre, String fecha, int tam, TipoFormato form) {
    super(nombre, fecha, tam);
    formato =form;
  }
  
  @Override
  public String toString() {
    return "Foto "+super.toString() + " Formato:" + formato;
  }
}