package espol.poo.modelo;

import java.util.ArrayList;
import java.io.*;

import espol.poo.utils.*;

public class Equipo implements BienAsegurado, Comparable<Equipo>{
    private String codigo;
    private String descripcion;
    private float costoAlquiler;
    private int stock;
    
    public Equipo(String codigo) {
        this.codigo = codigo;
    }
    public Equipo(String codigo, String descripcion, float costoAlquiler, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costoAlquiler = costoAlquiler;
        this.stock = stock;
    }
    
    public float calcularValorAlquiler(int dias)
    {
        return dias* costoAlquiler;
    }

    public String getCodigo(){
      return codigo;
    }
    public int getStock(){
      return stock;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj != null && obj.getClass()==this.getClass()) {
         Equipo other = (Equipo) obj;
         return codigo.equals(other.codigo);
        }
        return false;
    }

    @Override        
    public String toString() {
        return String.format("%8s\t%35s\t%8.2f\t%5d", codigo, descripcion, costoAlquiler,stock);
    }

    @Override
    public void asegurar(int dias){
        Misc.asegurarEquipo(dias);
    }

    @Override
    public int compareTo(Equipo otro){
        return descripcion.compareTo(otro.descripcion);
    }
    
    public static ArrayList<Equipo> cargarEquipos(String ruta){
        ArrayList <Equipo>lista = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta))){
            String linea;
            int i = 0;
            while((linea =bufferedReader.readLine()) != null){
                if(i > 0){
                    String[] datos = linea.split(", ");
                    float alquiler = Float.parseFloat(datos[2]);
                    int stock = Integer.parseInt(datos[3]);
                    Equipo e = new Equipo(datos[0], datos[1], alquiler, stock);
                    lista.add(e);

                }
                i++;
            }
        } catch(IOException e){
            e.printStackTrace();
        }

        return lista;
    }

    public static int consultarCantidadPrestamos(String codEquipo, String archivoRegistros){
        int contador = 0;
        try(BufferedReader bf = new BufferedReader(new FileReader(archivoRegistros))){
            String linea;
            int i = 0;            
            while((linea=bf.readLine())!=null){
                if(i>0){
                    String[] datos = linea.split(",");
                    if(datos[0].equals(codEquipo)) contador++;
                 }
                i++;
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return contador;
    }

}
