package com.githhub.thiagomagano;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    TipCalculator tc = new TipCalculator(100.00, 15);
    TipCalculator tc2 = new TipCalculator(11.25, 15);

    @Test
    public void shouldCalculateTipCorrect() {

        assertEquals(15.00, tc.tipValue, 0.1);
        assertEquals(1.69, tc2.tipValue, 0.1);

    }

    @Test
    public void shouldCalculateTotalBill() {

        assertEquals(115.00, tc.billTotal, 0.1);
        assertEquals(12.94, tc2.billTotal, 0.01);
    }
}
