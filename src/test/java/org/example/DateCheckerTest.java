package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @Test
    public void testHas31Days() {
        assertTrue(dateChecker.has31Days(DateChecker.Month.AUGUST));
    }
}
