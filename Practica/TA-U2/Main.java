import java.util.Scanner;
import modelo.*;

class Main {
  public static void main(String[] args) {
    Servidor[] listaServers = new Servidor[5];
    Scanner entrada = new Scanner(System.in);
    for(int i =0;i<=4;i++){
      System.out.print("Ingrese nombre del servidor: ");
      String nombre = entrada.nextLine();
      System.out.print("Ingrese ip del servidor: ");
      String ip = entrada.nextLine();  
      System.out.print("Ingrese cantidad de procesadores: ");
      int cantidadProcesador = entrada.nextInt();
      entrada.nextLine();
      System.out.print("Ingrese capacidad en disco(TB): ");
      float disco = entrada.nextFloat();
      entrada.nextLine();
      System.out.print("Ingrese capacidad en memoria(GB): ");
      float memoria = entrada.nextFloat();
      Servidor s = new Servidor(nombre, ip, cantidadProcesador, disco, memoria);
      listaServers[i] = s;
      entrada.nextLine();
    }

    System.out.println("Consulta de Información");
    System.out.print("Ingrese ip del servidor a consultar: ");
    String ipConsulta = entrada.nextLine();
    boolean resultado = false;
    for (int i = 0; i<listaServers.length;i++){
      String ip = listaServers[i].getIp();
      if (ip.equals(ipConsulta)){
        listaServers[i].mostrarInformacion();
        resultado = true;
      } else { }
      if (resultado == false){
        System.out.println("Resultado no encontrado");
      }
    }
    entrada.close();
    
  }
}