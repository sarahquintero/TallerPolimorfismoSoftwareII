/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.i_s_2_taller1;

/**
 *
 * @author iikan
 */
public class Triangle extends Figure {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        super(0, 0); 
        this.base = base;
        this.height = height;
    }
    
    public Triangle(double x1, double y1, double base, double height) {
        super(x1, y1);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
    
    @Override
    public double calculatePerimeter() {
        // Para un triángulo rectángulo
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return base + height + hypotenuse;
    }
    
    // Getters y setters específicos
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public String toString() {
        return String.format("Triangulo con medidas de: [Base=%.2f, Altura=%.2f, Area=%.2f, Perimetro=%.2f]", 
                base, height, calculateArea(), calculatePerimeter());
    }
}
