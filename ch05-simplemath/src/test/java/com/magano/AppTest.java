package com.magano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {

    SimpleCalculator calculator = new SimpleCalculator(10, 5);

    @Test
    void testAdd() {

        assertEquals(15, calculator.add());
        assertEquals(20, SimpleCalculator.add(18, 2));
    }

    @Test
    void testSub() {
        assertEquals(5, calculator.sub());
        assertEquals(16, SimpleCalculator.sub(18, 2));
    }

    @Test
    void testMulti() {
        assertEquals(50, calculator.multi());
        assertEquals(36, SimpleCalculator.multi(18, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide());
        assertEquals(9, SimpleCalculator.divide(18, 2));
    }
}
