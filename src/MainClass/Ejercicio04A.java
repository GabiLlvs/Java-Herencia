/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author gabri
 */
public class Ejercicio04A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        circ.setRadio(5);
        circ.setDiametro(2);
        System.out.println(circ);
        circ.calcArea();
        System.out.println("Area: " + circ.calcArea());
        circ.calcPeri();
        System.out.println("Perímetro " + circ.calcPeri());
        
        
        System.out.println();
        System.out.println("========================");
        System.out.println();
        
        Rectangulo rec = new Rectangulo();
        rec.setBase(2);
        rec.setAltura(4);
        System.out.println(rec);
        rec.calcArea();
        System.out.println("Area: " + rec.calcArea());
        rec.calcPeri();
        System.out.println("Perímetro " + rec.calcPeri());
    }
    
}
