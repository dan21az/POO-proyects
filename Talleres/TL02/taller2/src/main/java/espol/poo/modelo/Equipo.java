package espol.poo.modelo;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Personaje> personajes;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.personajes = new ArrayList<>();
    }

    public ArrayList<Personaje> getPersonajes(){
        return personajes;
    }
    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public String getNombre(){
        return nombre;
    }

    //COMPLETAR DE ACUERDO A LAS INSTRUCCIONES
    public void  atacarOtroEquipo(Equipo otroEquipo){
        System.out.println("Equipo atacante: "+nombre);
        int i = 0;
        for(Personaje a : otroEquipo.getPersonajes()){
            if(a.estaVivo()){
                personajes.get(i).realizarAtaque(a);
            }
        i++;
        }
    }

    public boolean estaDerrotado(){
        int i = 0;
        for (Personaje p: personajes){
            if(p.estaVivo()){
                i++;
            }
        }

        if(i==personajes.size()){
            return true;
        } else {
            return false;
        }
    }    


}
