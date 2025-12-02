package espol.poo.test;
import espol.poo.modelo.*;
import espol.poo.interfaces.*;

import java.util.ArrayList;

public class TestPorDefecto {
    public static void main(String[] args) {
        ArrayList<Recargable> recargables = new ArrayList<>();

        Laptop laptop1 = new Laptop(8, 450.8, 100);
        Laptop laptop2 = new Laptop(4, 410, 200);

        PowerBand powerband1 = new PowerBand("Adidaz", 75);
        PowerBand powerband2 = new PowerBand("Naik", 35);

        recargables.add(laptop1);
        recargables.add(laptop2);
        recargables.add(powerband1);
        recargables.add(powerband2);

        for(Recargable r : recargables){
            double nivelMaximo;
            if(r instanceof Laptop){
                nivelMaximo = Laptop.cargaMaxima;
            } else{
                nivelMaximo = PowerBand.getCargaMaxima();
            }
            double porcentaje = Recargable.calcularPorcentaje(r.getNivelBateria(), nivelMaximo);
            System.out.println(porcentaje+"-"+r.calcularMinimo());
        }
       
    }
}