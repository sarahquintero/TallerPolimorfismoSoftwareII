/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.i_s_2_taller1.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author iikan
 */
public class CirculeTest {
   private Circle circle;
    
    @BeforeEach
    void setUp() {
        circle = new Circle(2.0); // Radio = 2.0
    }
    
    @Test
    @DisplayName("Cálculo de área del círculo")
    void testCalculateArea() {
        double expectedArea = Math.PI * Math.pow(2.0, 2);
        assertEquals(expectedArea, circle.calculateArea(), 0.001);
    }
    
    @Test
    @DisplayName("Cálculo de perímetro del círculo")
    void testCalculatePerimeter() {
        double expectedPerimeter = 2 * Math.PI * 2.0;
        assertEquals(expectedPerimeter, circle.calculatePerimeter(), 0.001);
    }
    
    @Test
    @DisplayName("Círculo con radio 0")
    void testCircleWithZeroRadius() {
        Circle zeroCircle = new Circle(0);
        assertEquals(0, zeroCircle.calculateArea(), 0.001);
        assertEquals(0, zeroCircle.calculatePerimeter(), 0.001);
    }
    
    @Test
    @DisplayName("Getter y setter de radio")
    void testGetSetRadius() {
        circle.setRadius(5.0);
        assertEquals(5.0, circle.getRadius(), 0.001);
    }
    
}