/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.i_s_2_taller1;

/**
 *
 * @author iikan
 */
import java.util.ArrayList;
import java.util.List;

public class I_S_2_Taller1 {
    public static void main(String[] args) {
        Figure fig1 = new Circle(1.0); // radio
        Figure fig2 = new Square(2.3); // lado
        Figure fig3 = new Triangle(4.2, 4.5); // base y altura
        
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        
        System.out.println("Taller de Polimorfismo y pruebas unitarias en java");
        System.out.println("Figuras creadas:\n");
        
        for (Figure fig : figures) {
            System.out.println(fig);
        }
    
    }
}
