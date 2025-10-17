package espol.poo.apppokemonalimento;

import espol.poo.modelo.Alimento;
import espol.poo.modelo.Pokemon;

public class AppPokemonAlimento {

    public static void main(String[] args) {
        System.out.println("Trabajo autónomo");
        //Cree un alimento con las siguientes caracteristicas
        //nombre: "golden berry" , valor-nutricional: 100
        //use el contructor apropiado
        Alimento a1 = new Alimento("golden berry", 100);

        //Cree un alimento con las siguientes caracteristicas
        //nombre: "strawberry" , con valor nutricional predeterminado
        //use el contructor apropiado
        Alimento a2 = new Alimento("strawberry");

        
        //cree un nuevo pokemon
        Pokemon pk1 = new Pokemon("Pikachu","Barry");

        //1. Haga que el pokemon creado llame al método comer - (pase como argumento el primer alimento creado)
        pk1.comer(a1);

        //2.Muestre la información del Pokemon
        pk1.mostrarInformacion();
        
        //3.Haga que el pokemon creado llame al método comer - (pase como argumento el segundo alimento creado)
        pk1.comer(a2);

        //4. Muestre la información del Pokemon
        pk1.mostrarInformacion();


        /* //Parte 5
        //Literal 1
        Alimento a = new Alimento();
        a.nombre="fresa"; 
        
        //Literal 2
        Pokemon p1 = new Pokemon("Pikachu","Sparky",300,1200); 
        Pokemon p2 = p1;
        p1.setNombre("Gigante")
        System.out.println(p1.getNombre());
        System.out.println(p2.getNombre());
       
        //Literal 3
        Pokemon p3 = new Pokemon("Charizard","MyDragon"); 
        System.out.println(p3.mostrarInformacion());

        //Literal 4
        Pokemon p4 = new Pokemon("Chikorita","Chiko");
        p4.setPuntosSalud(100); 
        System.out.println(p4.mostrarInformacion());

        */

    }
    
}
