package espol.poo;

import java.util.ArrayList;

import espol.poo.modelo.*;

public class Main {
    public static void main(String[] args) {
    MyPhotos app = new MyPhotos();
    ArrayList<Archivo> seleccion = app.armarCarrusel(5);
    MyPhotos.mostrarCarrusel(seleccion);
    }
}