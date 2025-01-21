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
        int expectedResult = -1;
        assertEquals(calculator.subtract(1, 2), expectedResult);
    }

    @Test
    public void testMultiply() {
        int expectedResult = 2;
        assertEquals(calculator.multiply(1, 2), expectedResult);
    }

    @Test
    public void testDivide() {
        int expectedResult = 0;
        assertEquals(calculator.divide(1, 2), expectedResult);
    }

    @Test
    public void testModulus() {
        int expectedResult = 1;
        assertEquals(calculator.modulus(1, 2), expectedResult);
    }
}