/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.CalculosFormas;

/**
 *
 * @author gabri
 */
public class Rectangulo  extends Geometria implements CalculosFormas {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double area, double perimetro) {
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    @Override
    public double calcArea() {
        area = base * altura;
        return area;
    }

    @Override
    public double calcPeri() {   
        perimetro = (base + altura)*2;
        return perimetro;
    }
        
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
