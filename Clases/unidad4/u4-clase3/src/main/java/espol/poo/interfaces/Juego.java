package espol.poo.interfaces;
public interface Juego {
    int variable = 5;
    abstract void iniciar();
    void jugar();
    void finalizar();
  
    default void prueba(){
      System.out.println("Método por defecto");
    }

    public static void test(){
      System.out.println("Método estatico");
    }
}