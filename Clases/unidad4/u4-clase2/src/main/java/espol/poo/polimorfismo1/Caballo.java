package espol.poo.polimorfismo1;
public class Caballo extends Animal{
      private String color;
      public Caballo(int p, String c){
        super(p);
        color = c;
      }
       
    public void eat(){//metodo sobreescrito
        System.out.println("Caballo comiendo");
    }
    public void competir(){
        System.out.println("Caballo compitiendo");
    }

      @Override
      public String toString() {
        return "Caballo{" + super.toString() + 
                ",color=" + color +
                '}';
      }
}