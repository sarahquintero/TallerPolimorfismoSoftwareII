
import com.mycompany.i_s_2_taller1.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    
    private Triangle triangle;
    
    @BeforeEach
    void setUp() {
        triangle = new Triangle(4.0, 3.0); 
    }
    
    @Test
    @DisplayName("Cálculo de área del triángulo")
    void testCalculateArea() {
        double expectedArea = (4.0 * 3.0) / 2;
        assertEquals(expectedArea, triangle.calculateArea(), 0.001);
    }
    
    @Test
    @DisplayName("Cálculo de perímetro del triángulo rectángulo")
    void testCalculatePerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(4.0, 2) + Math.pow(3.0, 2)); // 5.0
        double expectedPerimeter = 4.0 + 3.0 + hypotenuse; // 12.0
        assertEquals(expectedPerimeter, triangle.calculatePerimeter(), 0.001);
    }
    
    @Test
    @DisplayName("Triángulo con base o altura 0")
    void testTriangleWithZeroDimensions() {
        Triangle zeroTriangle = new Triangle(0, 5.0);
        assertEquals(0, zeroTriangle.calculateArea(), 0.001);
        
        Triangle zeroTriangle2 = new Triangle(5.0, 0);
        assertEquals(0, zeroTriangle2.calculateArea(), 0.001);
    }
    
    @Test
    @DisplayName("Triángulo 3-4-5 clásico")
    void testClassicTriangle345() {
        Triangle classicTriangle = new Triangle(3.0, 4.0);
        assertEquals(6.0, classicTriangle.calculateArea(), 0.001); // (3*4)/2 = 6
        
        // prímetro: 3 + 4 + 5 = 12
        double expectedPerimeter = 3.0 + 4.0 + 5.0; // 5 es la hipotenusa
        assertEquals(expectedPerimeter, classicTriangle.calculatePerimeter(), 0.001);
    }
    
    @Test
    @DisplayName("Modificación de base y altura")
    void testSetBaseAndHeight() {
        triangle.setBase(6.0);
        triangle.setHeight(8.0);
        
        assertEquals(6.0, triangle.getBase(), 0.001);
        assertEquals(8.0, triangle.getHeight(), 0.001);
        assertEquals(24.0, triangle.calculateArea(), 0.001); // (6*8)/2 = 24
    }
}
