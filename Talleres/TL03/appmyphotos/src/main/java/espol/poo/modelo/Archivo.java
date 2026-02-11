package espol.poo.modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


//COMPLETAR LA DEFINCION DE LA CLASE
public abstract class Archivo implements Comparable<Archivo> {
  private String nombre;
  private String fecha;
  private int tamano;
  
  public Archivo(String nombre, String fecha, int tamano) {
  	this.nombre = nombre;
  	this.fecha = fecha;
  	this.tamano = tamano;
  }
  
  public String getNombre() {
  	return nombre;
  }
  
  public String getFecha() {
  	return fecha;
  }
  
  public int getTamano() {
  	return tamano;
  }
  
  @Override
  public String toString() {
  	return 
  			"nombre='" + nombre + '\'' +
  			", fecha='" + fecha + '\'' +
  			", tamano='" + tamano + '\''
  			;
  }

  @Override
  public int compareTo(Archivo otro){
    return Integer.compare(tamano, otro.tamano);
  }

  public static ArrayList<Archivo> leerArchivos(String ruta){

    ArrayList<Archivo> lista = new ArrayList<>();

    try (BufferedReader bf = new BufferedReader(new FileReader(ruta))) {
      String linea;

      while((linea=bf.readLine())!=null){
        String[] datos = linea.split(",");
        
        try{
        if(datos[0].equals("foto")){
          int tamaño = Integer.parseInt(datos[3]);
          TipoFormato formato = TipoFormato.valueOf(datos[4]);
          Foto foto = new Foto(datos[1], datos[2], tamaño,formato);
          lista.add(foto);
        } else if(datos[0].equals("video")){
          int tamaño = Integer.valueOf(datos[3]);
          int duracion = Integer.parseInt(datos[4]);
          Video video = new Video(datos[1], datos[2], tamaño, duracion);
          lista.add(video);
        }
        } catch (Exception e) {
          System.out.println("Error procesando la linea"+linea);
        }
        };
      
      }
     catch (FileNotFoundException e) {
      System.out.println("Archivo no encontrado");
    } catch(IOException e){
      System.out.println("Error al procesar el archivo"+ e);
    }
  return lista;  
}
}