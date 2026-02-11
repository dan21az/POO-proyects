public class Main {
    public static void main(String[] args) {
        System.out.println("Sintaxis de java");

    
        int n = 10;
        float m = 4.5f;
        int o = 4;
        System.out.println("este es n "+ n);

        System.out.println(n/m);//es un float
        System.out.println(n/o);//es un entero



        
        // Operadores aritméticos
        // Declaramos y asignamos valores a las siguientes variables tipo int, float y
        // String
        int a = 20, b = 10, c = 0;
        byte a1 = 40;
        float d = 20.0f, e = 40.0f, f = 30.0f;

        String x = "Muchas", y = "gracias";
        // Utilizando las variables probaremos cada uno de los operadores aritméticos.
        // Operador + y -
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        // El operador + si se usa con strings
        // concatena las cadenas dadas.
        System.out.println("x + y = " + x + y);
        // Operador * y /
        // promoción aritmética el resultado se convierte en float
        System.out.println("a * d = " + (a * d));
        System.out.println("e / b = " + (e / b));
        // operador de módulo da el resto
        // de dividir el primer operando con el segundo
        System.out.println("e % f = " + (e % f));

        // Operadores unarios
        // Los operadores unarios solo necesitan un operando

        // operador de pre-incremento
        // a = a+1 y entonces c = a;
        ++a;// a= a +1;
        System.out.println("a " + a);
        a++;
        c = ++a;
        System.out.println("Valor de c (++a) = " + c);
        System.out.println("Valor de a = " + a);
        // operador de post-incremento
        // c=b entonces b=b+1 (b pasa a ser 11)
        c = b++;
        a += 5;
        System.out.println("Valor de c (b++) = " + c);
        System.out.println("Valor de b  = " + b);
        // operador de pre-decremento
        // a=a-1 entonces c=a
        c = --a;
        System.out.println("Valor de c (--a) = " + c);
        // operador de post-decremento
        // c=b entonces b=b-1 (b pasa a ser 39)
        c = b--;
        System.out.println("Valor de c (b--) = " + c);
        // Operadores lógicos y relacionales
        // Los operadores relacionales se utilizan para verificar relaciones como
        // igualdad, mayor que, menor que. Devuelven el resultado booleano después de la
        // comparación.

        // varios operadores relacionales
        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));

        // Los operadores lógicos se utilizan para realizar operaciones “lógicas AND” y
        // “lógicas OR”

        // OPERADORES LÓGICOS
        int vMin = 0, vMax = 10;
        // operador &&
        boolean resultado1 = a >= vMin && a <= vMax;
        System.out.println("resultado=" + resultado1);
        // operador ||
        boolean vacaciones = false;
        boolean diasDescanso = true;
        System.out.println("vacaciones o descanso = " + (vacaciones || diasDescanso));

        // Operador lógico not
        System.out.println("Valor de !vacaciones = " + !vacaciones);
        
        //Ejemplo de for que combina otra variable
        boolean encontrado = false;
        for(int i=0;i<10  && !encontrado ;i++){ 
            if (i==5) {
                encontrado=true;
            }
            System.out.println("This is i:"+i);
            
        } 
       
                  					
            
        //recuperar valores de la consola
        int numero =  Integer.valueOf( args[0])  ;
        System.out.println(numero * 2);

    }
}