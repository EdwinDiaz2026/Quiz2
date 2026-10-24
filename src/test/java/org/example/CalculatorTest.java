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
    }

    @Test
    void testProduct() {
    }

    @Test
    void testQuotient() {
    }

    @Test
    void isEven() {
    }
}