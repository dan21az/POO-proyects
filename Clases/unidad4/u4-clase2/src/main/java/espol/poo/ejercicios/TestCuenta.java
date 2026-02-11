package espol.poo.ejercicios;
class    Cuenta{
    String numero;
    double saldo;
     Cuenta(String n, double saldo) {
        this.numero = n;
        this.saldo = saldo;
    }
    void depositar(double valor){
        saldo+=valor;
    }

}

class CuentaAhorro extends Cuenta{
         CuentaAhorro(String n, double monto) {
        super(n,monto);
    }

    void depositar(double valor){
        saldo+=valor+10;
    }
}

class CuentaAhorroProgramado extends CuentaAhorro{
    int tiempo;
         CuentaAhorroProgramado(String n, double monto) {
        super(n,monto);
        this.tiempo=5;
    }

  void setTiempo(int t){
    tiempo =t;
  }
}
public class TestCuenta {
    public static void main(String[] args) {
           Cuenta c1 = new Cuenta("123",100);
    c1.depositar(20);
    System.out.println(c1.saldo);

    Cuenta c2 = new CuentaAhorro("456",100);
    c2.depositar(20);
    System.out.println(c2.saldo);

    Cuenta c3 = new CuentaAhorroProgramado("789",100);
    c3.depositar(20);
    System.out.println(c3.saldo);

    }
}
