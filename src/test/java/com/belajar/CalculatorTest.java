package com.belajar;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        assertEquals(calculator.add(1, 2), 3);
    }

    @Test
    public void testSubstract() {
        assertEquals(calculator.subtract(1, 2), -1);
    }

    @Test
    public void testMultiply() {
        assertEquals(calculator.multiply(1, 2), 2);
    }

    @Test
    public void testDivide() {
        assertEquals(calculator.divide(1, 2), 0);
    }

    @Test
    public void testModulus() {
        assertEquals(calculator.modulus(1, 2), 1);
    }
}