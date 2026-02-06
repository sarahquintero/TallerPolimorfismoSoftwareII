/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.i_s_2_taller1;

/**
 *
 * @author iikan
 */
public class Circle extends Figure{
    private double radius;
    
    public Circle(double radius) {
        super(0, 0); // datos por defecto de X y Y
        this.radius = radius;
    }
    
    public Circle(double x1, double y1, double radius) {
        super(x1, y1);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return String.format("Circulo con: [Radio=%.2f, Area=%.2f, Perimetro=%.2f]", 
                radius, calculateArea(), calculatePerimeter());
    }  
}
