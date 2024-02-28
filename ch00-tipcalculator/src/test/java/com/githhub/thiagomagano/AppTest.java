package com.githhub.thiagomagano;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    TipCalculator tc = new TipCalculator(100.00, 15);
    
    @Test
    public void shouldCalculateTipCorrect() {
        double want = 15.00;
        double got = tc.calculateTip(tc.billAmount, tc.tipRate);
        
        assertEquals(want,got, 0.1);
    }

    @Test
    public void shouldCalculateTotalBill() {
        double want = 115.00;
        double got = tc.calculateTotalBill(tc.billAmount, tc.tipValue);

        assertEquals(want, got, 0.1);
    }
}
 