/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.ejeq;

/**
 *
 * @author Gladys
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    //primer intento fallido de sobreescritura
    //la firma debe coincider con la firma en la clase padre.  
    //parametro debe ser Object
    /*@Override
    public boolean equals(Point other) {
        
            return x==other.x && y==other.y;
    }*/
    //segundo intento fallido de sobreescritura
    //el objeto de tipo object no tiene x ni y
    /*@Override
    public boolean equals(Object other) {
        
            return x==other.x && y==other.y;
    }*/
    //tercer intento sobrescritura
    //este metodo puede fallar si se envia un objeto de un tipo diferente
    /*public boolean equals(Object other) {
        Point o =(Point) other;
        return x==o.x && y==o.y;
    }*/
    //cuarto intento sobreescritura
    // al utilizar instanceof se verifica tambien las superclases
    // al tener un point3d instance of da true a Point
    // este ejemplo de equals puede servir cuando las clases hijas comparten el atributo unico que las distingue
   /* public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && other instanceof Point){
            Point o =(Point) other;
            return x==o.x && y==o.y;
        } 
        return false;
    }*/

    //implementacion válida, usa getClass para verificar la clase
  //  @Override
   public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj != null && this.getClass() == obj.getClass()) {
            Point o =(Point) obj;
            return x==o.x && y==o.y;
        }else{
            return false;
        }
    }

    


    
    
    
}
