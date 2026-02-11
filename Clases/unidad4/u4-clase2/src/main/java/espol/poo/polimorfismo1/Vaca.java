package espol.poo.polimorfismo1;
public class Vaca extends Animal{

  private boolean lechera;
  public Vaca(int p, boolean l){
    super(p);
    lechera = l;
  }
  
    public void eat(){//metodo sobreescrito, amplia la funcionalidad
      super.eat();
      System.out.println("Vaca comiendo");
    }
  @Override
  public String toString() {
    return "Vaca{" + super.toString() + 
            ",lechera=" + lechera +
            '}';
  }
  


}