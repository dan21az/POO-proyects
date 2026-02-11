package espol.poo;

import espol.poo.modelo.Equipo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
class Main {
  public static String RUTA_EQUIPOS = "archivos/equipos.csv";
  public static String RUTA_REGISTROS = "archivos/registroalquiler.csv";
  public static void main(String[] args) {
    pruebaAlquiler();
  }

  
    public static void pruebaAlquiler(){
        ArrayList<Equipo> equipos = null;
        Scanner sc = new Scanner(System.in);
        //prueba de alquiler de equipos
        System.out.println("Prueba de alquiler");
        //TODO: llamar al metodo cargarEquipos, almacene la lista en la variable equipos definida en esta funcion
        equipos = Equipo.cargarEquipos(RUTA_EQUIPOS);
        //TODO: ordenar la lista
        Collections.sort(equipos);
        //TODO: presenta los equipos, usar for para presentar cada equipo con un print - puede crear un método para esto
        for(Equipo e : equipos){
          System.out.println(e.toString());
        }
        //pedir el ingreso del codigo del equipo a alquilar hasta que escriba N
        String respuesta = "S";

        while (!respuesta.toUpperCase().equals("N")){
        //se mantendra solicitando el codigo de un equipo
        //mientras no encuentre uno en la lista
        //objBusqueda me servira para buscar en la lista y luego para almacenar el objeto real
        Equipo objBusqueda = null;
        String idConsulta = "";
        do {

            System.out.println("Ingrese codigo del equipo:");
            idConsulta = sc.nextLine();
            objBusqueda = new Equipo(idConsulta);
          //el metodo contains funciona porque la clase Equipo 
          //tiene el metodo equals que verifica el codigo
        } while (!equipos.contains(objBusqueda));

        //aqui ya el codigo existe en la lista por lo que podemos recuperar el objeto real
        int ind = equipos.indexOf(objBusqueda); //indice del objeto real
        
        //usar el indice para recuperar el equipo
        objBusqueda = equipos.get(ind);
        System.out.println("Equipo encontrado:");
        System.out.println(objBusqueda);

        
        //TODO: escribir el codigo para realizar lo indicado en los comentarios - puede realizar esto en otro método
        //verificar que exista stock para poder alquilar equipo
        //utilice la funcion consultarCantidadPrestamos
        //debe verificar que los prestamos registrados para ese equipo sea menor al stock
        if(Equipo.consultarCantidadPrestamos(objBusqueda.getCodigo(), RUTA_REGISTROS)<objBusqueda.getStock()){
        //si hay stock para prestar el equipo:
            //solicite la cantidad de dias a alquiler y llame al metodo calcularValorAlquiler
          System.out.println("Ingrese la cantidad de días a alquilar: ");
          int dias = sc.nextInt();
          sc.nextLine();
          float valor = objBusqueda.calcularValorAlquiler(dias);
            //llamar al metodo asegurar
          objBusqueda.asegurar(dias);
            //escribir en el archivo de registros el nuevo alquiler usando la funcion  registrarAlquiler
          registrarAlquiler(objBusqueda.getCodigo(), dias);
            //mostrar la cantidad a pagar de alquiler
          System.out.println("Valor a pagar por el alquiler: " + valor);
        } else{
         //si no hay stock entonces muestra el mensaje
          System.out.println("Ya no hay equipos disponibles para alquilar");
        }
        //luego de procesar ese equipo pregunta si desea continuar consultando
        System.out.println("Desea seguir consultando S/N ?");
        respuesta= sc.nextLine();

        }
      sc.close();
    }


    public static void registrarAlquiler(String codEquipo, int dias){
      //TODO: escribir en el archivo de registro el nuevo alquiler
      try(BufferedWriter bf = new BufferedWriter(new FileWriter(RUTA_REGISTROS, true))){
        String linea = codEquipo+","+dias;
        bf.write(linea);
        bf.newLine();
      } catch (Exception e) {
        e.printStackTrace();
        // TODO: handle exception
      }
      //cada linea en archivo tiene codigo y numero de dias
    }
}