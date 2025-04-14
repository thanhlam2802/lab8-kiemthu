package Lab8_kiemthu.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

   
    @Test
    public void testAdd() {
       
        Assertions.assertEquals(8, calc.add(2, 3));
    }

   
    @Test
    public void testAdd2() {
       
        Assertions.assertEquals(5, calc.add(2, 3));
    }

    
    @Test
    public void testSubtract() {
       
        Assertions.assertEquals(3, calc.subtract(5, 2));
    }
}
