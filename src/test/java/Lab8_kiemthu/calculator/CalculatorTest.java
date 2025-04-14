package Lab8_kiemthu.calculator;



import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.add(2, 3), 2);
    }
    @Test
    public void testAdd2() {
        Assert.assertEquals(calc.add(2, 3), 2);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.subtract(5, 2), 3);
        System.out.print("test thanh con");
    }
}
