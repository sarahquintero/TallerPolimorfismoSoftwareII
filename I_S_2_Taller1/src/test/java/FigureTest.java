/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import com.mycompany.i_s_2_taller1.Circle;
import com.mycompany.i_s_2_taller1.Figure;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author iikan
 */
public class FigureTest {
    
    @Test
    void testFigureConstructor() {
        Figure figure = new Circle(0, 0, 5.0); 
        assertEquals(0, figure.getX1());
        assertEquals(0, figure.getY1());
        
        figure.setX1(10.5);
        figure.setY1(20.3);
        
        assertEquals(10.5, figure.getX1());
        assertEquals(20.3, figure.getY1());
    }
    
    @Test
    void testFigureToString() {
        Figure figure = new Circle(2.5, 3.5, 1.0);
        String expected = "Circulo con: [Radio=1,00, Area=3,14, Perimetro=6,28]";
        assertEquals(expected, figure.toString());
    }
}

