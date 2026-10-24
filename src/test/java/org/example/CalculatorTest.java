package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testSum() {
        assertEquals(5, calculator.add(2, 3)); //Positive ints
        assertEquals(-3, calculator.add(-2, -1)); //Negative ints
        assertEquals(8, calculator.add(0, 8)); //Zero value
    }

    @Test
    void testDifference() {
        //I chose these two cases since they should result in opposite signs
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void testProduct() {
        assertEquals(6, calculator.multiply(2,3));
        assertEquals(0, calculator.multiply(17, 0));
        assertEquals(24, calculator.multiply(-4, -6));
    }

    @Test
    void testQuotient() {

        assertEquals(3, calculator.divide(6,2));
        assertEquals(6, calculator.divide(18, 3));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        String expectedMessage = "Ints can NOT be divided by zero";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage,actualMessage);

    }

    @Test
    void isEven() {
        assertTrue(calculator.isEven(4)); //expected to be true
        assertFalse(calculator.isEven(3)); //expected to be false
    }
}