package espol.poo.test;

import java.util.ArrayList;

import espol.poo.interfaces.HuellaElectrica;
import espol.poo.modelo.Hotel;
import espol.poo.modelo.Laptop;

public class TestEficienciaElectrica {
    public static boolean esEficiente(HuellaElectrica e) {
        return (e.getEficienciaElectrica()<HuellaElectrica.LIMITECONSUMO);
    }
    public static void main(String[] args) {
        ArrayList<HuellaElectrica> listaHuellaElectrica = new ArrayList<>();
        
        Hotel hotel1 = new Hotel(100, 9000);
        Hotel hotel2 = new Hotel(80, 10000);

        Laptop laptop1 = new Laptop(8, 450.8, 100);
        Laptop laptop2 = new Laptop(4, 410, 200);

        listaHuellaElectrica.add(hotel1);
        listaHuellaElectrica.add(hotel2);
        listaHuellaElectrica.add(laptop1);
        listaHuellaElectrica.add(laptop2);


        for(HuellaElectrica e : listaHuellaElectrica){
            System.out.println(e.getEficienciaElectrica()+"-"+esEficiente(e));
        }
        //completar

    }
}
