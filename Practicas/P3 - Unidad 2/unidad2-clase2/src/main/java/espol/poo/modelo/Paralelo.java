package espol.poo.modelo;

import java.util.ArrayList;

public class Paralelo{
    private String num;
    private ArrayList<Estudiante> listaEstudiantes;
  
    public Paralelo(String num){
      this.num = num;
  
      listaEstudiantes = new ArrayList<>();//crear el arraylist
    }
  
    public void asignarEstudiante(Estudiante e){
      listaEstudiantes.add(e);
    }
  
    public  ArrayList<Estudiante> getListaEstudiantes(){
      return listaEstudiantes;
    }
  }