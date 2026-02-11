package espol.poo.avis;

public class TestAvis {
    public static void main(String[] args) {
        //crear los vehiculos
        System.out.println("Vehiculos:");
        CarroTurismo tur = new CarroTurismo("GXF-1234", "Chevrolet", 100.50f, 20);
        Camion camion = new Camion("GXS-2343", "Chevroelt", 200, 500, true);
        camion.marca = "Hino";
    }
}
