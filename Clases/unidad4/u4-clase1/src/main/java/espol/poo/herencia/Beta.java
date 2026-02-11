package espol.poo.herencia;

import espol.poo.constructores2.Alpha;

public class Beta extends Alpha{
  int p;
  public Beta(int num, int p){
    super(num);
    this.p=p;
  }
  public static void main(String[] args){
    Beta ob1 = new Beta(2,3);
    System.out.println(ob1.num);
  }
}
