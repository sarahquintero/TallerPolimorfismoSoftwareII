/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.i_s_2_taller1;

/**
 *
 * @author iikan
 */
public class Square extends Figure {
    private double side;
    
    public Square(double side) {
        super(0, 0); 
        this.side = side;
    }
    
    public Square(double x1, double y1, double side) {
        super(x1, y1);
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
    
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
    
    // Getter y setter específico
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public String toString() {
        return String.format("Cuadrado con medidas de: [Lado=%.2f, Area=%.2f, Perimetro=%.2f]", 
                side, calculateArea(), calculatePerimeter());
    }
}

