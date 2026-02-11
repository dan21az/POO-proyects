package espol.poo.modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class MyPhotos {
ArrayList<Archivo> archivos;
  public MyPhotos(){
    //llama al método que carga los archivos
     cargarArchivos();
  }

  public void cargarArchivos(){
    Archivo[] arreglo = {
    new Foto("paseo1","2022-05-20",25,TipoFormato.PNG),
    new Foto("paseo2","2022-05-20",25,TipoFormato.JPEG),
    new Foto("paseo3","2022-05-20",25,TipoFormato.PNG),
    new Foto("paseo4","2022-05-20",25,TipoFormato.TIFF),
    new Foto("paseo5","2022-05-20",25,TipoFormato.JPEG),
    new Video("paisaje","2022-05-20",100,33),
    new Foto("paseo7","2022-05-20",25,TipoFormato.JPEG),
    new Video("comida1","2022-05-20",110,40),
    new Video("comida2","2022-05-20",110,50),
    new Video("comida3","2022-05-20",110,40),
    new Video("comida4","2022-05-20",110,50),
    new Video("comida5","2022-05-20",110,40),
    new Video("comida6","2022-05-20",110,5),
    new Foto("paseo6","2022-05-20",25,TipoFormato.PNG),  
    new Foto("trabajo1","2022-06-12",25,TipoFormato.PNG),
    new Foto("trabajo2","2022-06-12",25,TipoFormato.JPEG),
    new Foto("gato","2023-05-12",25,TipoFormato.TIFF),
    new Video("reunion","2023-05-12",25,10)
    };
    archivos = new ArrayList<>(Arrays.asList(arreglo));

  }

  //IMPLEMENTAR armarCarrusel


  //IMPLEMENTAR mostrarCarrusel
}
