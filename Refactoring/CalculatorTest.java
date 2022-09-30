package Refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

//    @Test
    public void testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 3;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }
    @Test
    public void testCalculateSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }
}
