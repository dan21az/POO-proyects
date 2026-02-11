package espol.poo.polimorfismo1;
public class Animal{
      private int numPatas;
      public Animal(int patas){
        numPatas = patas;
      }

    public void eat(){ 
        System.out.println("Animal general comiendo");
    }

    
    @Override
    public String toString() {
        return "numPatas=" + numPatas ;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + numPatas;
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Animal other = (Animal) obj;
      if (numPatas != other.numPatas)
        return false;
      return true;
    }


}