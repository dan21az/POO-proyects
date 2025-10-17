/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espol.poo.micosecha;
import java.util.Scanner;
import espol.poo.micosecha.modelo.*;
/**
 *
 * @author Gladys
 */
public class MiCosecha {

    public static void main(String[] args) {

        //completar de acuerdo a las instrucciones
        Scanner entrada = new Scanner(System.in);
        
        //Crear el personaje Principal
        System.out.print("Ingrese el nombre del personaje principal: ");
        Personaje p1 = new Personaje(entrada.nextLine(), true);
        //Crear el personaje del zorro
        System.out.print("Ingrese el nombre del zorro: ");
        Personaje p2 = new Personaje(entrada.nextLine());
        
        //Crear 1era fruta
        System.out.print("Ingrese el nombre de la fruta 1: ");
        String nf1 = entrada.nextLine();
        System.out.print("Ingrese calorias de la fruta 1: ");
        int cf1 = entrada.nextInt();
        Fruta f1 = new Fruta(nf1,cf1);
        //Crear 2da fruta
        System.out.print("Ingrese el nombre de la fruta 2: ");
        String nf2 = entrada.nextLine();
        entrada.nextLine();
        System.out.print("Ingrese calorias de la fruta 2: ");
        int cf2 = entrada.nextInt();
        Fruta f2 = new Fruta(nf2,cf2);
        
        entrada.close();
        
        //Interaccion entre personajes y frutas
        p1.recolectar(f1);
        p2.recolectar(f2);
        
        //Mostrar la info de los personajes
        p1.mostrarInformacion();
        p2.mostrarInformacion();
    }

}
