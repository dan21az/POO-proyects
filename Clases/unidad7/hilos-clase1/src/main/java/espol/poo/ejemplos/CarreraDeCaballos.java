package espol.poo.ejemplos;


public class CarreraDeCaballos {
    public static void main(String[] args) {
       
        Caballo[] caballos = new Caballo[5];
        caballos[0] = new Caballo("Relámpago");
         caballos[1] = new Caballo("Roma");
        caballos[2] = new Caballo("Campanita");
        caballos[3] = new Caballo("Juanito");
        caballos[4] = new Caballo("Puka");
        // Crear e inicializar otros caballos...
        // ...

        //complete el código necesario para que todos estos caballos formen parte de la carrera
        for (Caballo c: caballos){
            //c.start();
            Thread th = new Thread(c);
            th.start();
        }
    }
}