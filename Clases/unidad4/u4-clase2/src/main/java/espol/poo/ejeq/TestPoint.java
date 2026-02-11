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
public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(5,3);
        Point p2 = new Point(5,3);
        Point p3 = p2;
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals("Punto"));
        Object o1 = new Point(5,-3);
        
        //objetos 3d
        System.out.println("===========");
        Point3D p4 = new Point3D(5,3,8);
        Point3D p5 = new Point3D(5,3,9);
        System.out.println(p4.equals(p5));
        System.out.println(p2.equals(p4)); 
    }
}
