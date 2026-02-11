/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.runnable;

/**
 *
 * @author Gladys
 */
public class EjemploHilos2 {
    
    public static void main(String[] args) {       
        EjemploHilos2 ej = new EjemploHilos2();
        ej.iniciarHilos();
    
       
    }
    
    public void iniciarHilos(){
        System.out.println("Ejemplo con runnable");
        Tarea2 tarea1 = new Tarea2();//primero se crea el objeto
        
        Tarea2 tarea2 = new Tarea2();
        //Thread t1 = new Thread(tarea1);
        Thread t2 = new Thread(tarea2);
        Thread t1 = new Thread(new Tarea2(),"Hilo 1");
        
        //con clase interna
        TareaI tI = new TareaI();
        Thread t3 = new Thread(tI);

        //con clase anonima

        Thread t4 = new Thread( new Runnable(){
            @Override
            public void run() {
                for (int i=1;i<=50;i++) {
                    System.out.println(i);
                }
            }
        });
        //con lambda
     

        Thread t5 = new Thread(
                () ->{
                    for (int i=1;i<=50;i++) {
                        System.out.println(i);
                    }
                }
        );

        t3.start();
                        
        t1.start();
        
        t2.start();
        t4.start();
        t5.start();
    }
    
    //clase interna
    
    class TareaI implements Runnable{
        @Override
        public void run() {
            for (int i=1;i<=50;i++) {
                System.out.println(i);
            }
        }
    }
}
