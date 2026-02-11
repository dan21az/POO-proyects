/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.unidad5.modelo;

import java.io.Serializable;

/**
 *
 * @author Gladys
 */
public class Direccion  implements Serializable{
    private String calle1;
    private int numero;
    private String calle2;
    private static final long serialVersionUID = 8799656478674716638L;

    public Direccion(String calle1, int numero, String calle2) {
        this.calle1 = calle1;
        this.numero = numero;
        this.calle2 = calle2;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle1=" + calle1 + ", numero=" + numero + ", calle2=" + calle2 + '}';
    }
    
    
}
