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
public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.z;
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj != null && getClass() == obj.getClass()) {
            Point3D o =(Point3D) obj;
            return super.equals(obj) && z==o.z;
        }else{
            return false;
        }
    }
    
}
