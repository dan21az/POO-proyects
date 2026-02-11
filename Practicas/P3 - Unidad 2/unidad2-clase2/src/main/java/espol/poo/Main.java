package espol.poo;


import java.util.ArrayList;

import espol.poo.modelo.*;

public class Main {
    public static void main(String[] args) {

float v = 2.3f;
int e = (int) v;

System.out.println(e);
System.out.println("XXXXXXXXXXXXXXXXXXX");
       
        Carro[] arrCarros = new Carro[3];
        ArrayList<Carro> listaCarros = new ArrayList<>();

        arrCarros[0] = new Carro("GST-2344", "azul");
        arrCarros[1] = new Carro("GSE-1344", "negro");
        System.out.println("Length arreglo:" + arrCarros.length);

        listaCarros.add(new Carro("GST-2344", "azul"));
        listaCarros.add(new Carro("GSE-1344", "negro"));
        System.out.println("Tamano lista:" + listaCarros.size());
        System.out.println(arrCarros);
        // iterar con for tradicional
        System.out.println("Iterando arreglo con for");
        for (int i = 0; i < arrCarros.length; i++) {
            System.out.println(arrCarros[i]);
            // la siguiente linea da error si el arreglo no tiene objetos en todos sus
            // indices
            // System.out.println("Imprimiendo solo color:"+arrCarros[i].getColor());
             if (arrCarros[i] != null)
                System.out.println("Imprimiendo solo color:" + arrCarros[i].getColor());

        }
        System.out.println("Lista entera");
        System.out.println(listaCarros);
        System.out.println("===");

        System.out.println("Iterando lista con for");
        for (int i = 0; i < listaCarros.size(); i++) {
            System.out.println(listaCarros.get(i));
        }

        // iterar con for extendido
        System.out.println("Iterando arreglo con for extendido");
        for (Carro c : arrCarros) {
            if (c != null)
                System.out.println(c.getColor());
        }
        for (Carro c : listaCarros) {
            System.out.println(c);
        }

        // listas como atributos

        Paralelo p1 = new Paralelo("3");
        Estudiante e1 = new Estudiante("34", "Carlos Salazar");
        Estudiante e2 = new Estudiante("35", "Gabriela Mera");
        p1.asignarEstudiante(e1);
        p1.asignarEstudiante(e2);
        System.out.println(p1.getListaEstudiantes());

        // listas de clases wrappers
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(50);
        listaNumeros.add(100);
        System.out.println(listaNumeros);
    }
}