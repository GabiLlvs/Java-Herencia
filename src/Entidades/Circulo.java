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
public class Circulo extends Geometria implements CalculosFormas {

    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro, double area, double perimetro) {
        super(area, perimetro);
        this.radio = 5;
        this.diametro = 2;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public double calcArea() {        
        double num = Math.pow(radio, 2);
        area = (pi * num);
        return area;

    }

    @Override
    public double calcPeri() {
        perimetro = (pi * diametro);
        return perimetro;
    }
    
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

}
