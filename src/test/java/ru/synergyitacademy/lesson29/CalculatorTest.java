package ru.synergyitacademy.lesson29;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldCalculateRightSumma() {
        Calculator calculator = new Calculator(10, 11);
        Assert.assertEquals(21, calculator.summa());
        Calculator calculator2 = new Calculator(1, -1);
        Assert.assertEquals(0, calculator2.summa());
        Calculator calculator3 = new Calculator(0, 0);
        Assert.assertEquals(0, calculator3.summa());
    }

    @Test
    public void shouldCalculateRightDivision() {
        Calculator calculator = new Calculator(10, 11);
        Assert.assertEquals(0, calculator.division());
        Calculator calculator2 = new Calculator(15, 3);
        Assert.assertEquals(5, calculator2.division());
    }

    @Test(expected = ArithmeticException.class)
    public void shouldCalculateRightDivisionByZero() {
        Calculator calculator = new Calculator(10, 0);
        calculator.division();
    }

    @Test
    public void shouldCalculateRightMultiply() {
        Calculator calculator = new Calculator(10, 11);
        Assert.assertEquals(110, calculator.multiply());
        Calculator calculator2 = new Calculator(10, -11);
        Assert.assertEquals(-110, calculator2.multiply());
    }
}
