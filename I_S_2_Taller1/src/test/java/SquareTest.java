/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.i_s_2_taller1.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author iikan
 */
public class SquareTest {
    
       private Square square;
    
    @BeforeEach
    void setUp() {
        square = new Square(3.0);
    }
    
    @Test
    @DisplayName("Cálculo de área del cuadrado")
    void testCalculateArea() {
        assertEquals(9.0, square.calculateArea(), 0.001);
    }
    
    @Test
    @DisplayName("Cálculo de perímetro del cuadrado")
    void testCalculatePerimeter() {
        assertEquals(12.0, square.calculatePerimeter(), 0.001);
    }
    
    @Test
    @DisplayName("Cuadrado con lado 0")
    void testSquareWithZeroSide() {
        Square zeroSquare = new Square(0);
        assertEquals(0, zeroSquare.calculateArea(), 0.001);
        assertEquals(0, zeroSquare.calculatePerimeter(), 0.001);
    }
    
    @Test
    @DisplayName("Cuadrado negativo - debe lanzar excepción?")
    void testSquareWithNegativeSide() {
        Square negativeSquare = new Square(-2.0);
        // El área debería ser positiva (por el cuadrado)
        assertEquals(4.0, negativeSquare.calculateArea(), 0.001);
        assertEquals(-8.0, negativeSquare.calculatePerimeter(), 0.001); // -2 * 4 = -8 perímetro negativo
    }
    
    @Test
    @DisplayName("Cambio de tamaño del lado")
    void testChangeSide() {
        square.setSide(5.0);
        assertEquals(25.0, square.calculateArea(), 0.001);
        assertEquals(20.0, square.calculatePerimeter(), 0.001);
    }

}
