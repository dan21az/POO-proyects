package espol.poo.modelo;


public class Carro{
  private String matricula;
  private String color;

  public Carro(String m, String c){
    matricula = m;
    color = c;
  }
  
  public String toString(){
    return "Carro:"+matricula+", color:" + color;
  }

  public String getColor(){
    return color;
  }
  
}