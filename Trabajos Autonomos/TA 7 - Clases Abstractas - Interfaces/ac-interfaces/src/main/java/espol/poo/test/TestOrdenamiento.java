package espol.poo.test;

import java.util.*;

import espol.poo.modelo.Hotel;

public class TestOrdenamiento {

    public static void main(String[] args) {

        ArrayList <Hotel> hoteles = new ArrayList<>();

        hoteles.add(new Hotel(40, 300.5));
        hoteles.add(new Hotel(10, 120.0));
        hoteles.add(new Hotel(70, 900.2));
        hoteles.add(new Hotel(25, 180.0));

        Collections.sort(hoteles);

        for(Hotel h : hoteles){
            System.out.println(h);
        }
    }
}
