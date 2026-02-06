/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.i_s_2_taller1;

/**
 *
 * @author iikan
 */
public abstract class Figure {
    protected double x1;
    protected double y1;
    

    public Figure(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    public double getX1() {
        return x1;
    }
    
    public void setX1(double x1) {
        this.x1 = x1;
    }
    
    public double getY1() {
        return y1;
    }
    
    public void setY1(double y1) {
        this.y1 = y1;
    }
    
    @Override
    public String toString() {
        return String.format("Figura con medidas de (%.2f, %.2f)", x1, y1);
    }

}
