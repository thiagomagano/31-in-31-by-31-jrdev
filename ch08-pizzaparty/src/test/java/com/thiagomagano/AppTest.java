package com.thiagomagano;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldDividePizzaEvenly() {
        int want = 2;
        int got = PizzaCalculator.divide(8, 2, 8);
        assertEquals(want, got);
    }

    @Test
    public void shouldShowTheReminder() {
        int want = 0;
        int got = PizzaCalculator.reminder(8, 2, 8);
        assertEquals(want, got);
    }
}
