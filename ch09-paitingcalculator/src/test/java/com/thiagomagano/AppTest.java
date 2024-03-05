package com.thiagomagano;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    int l = 19;
    int w = 19;
    int squareFeet;

    @Test
    public void squareFeetTest() {
        int want = 361;
        int got = CalcPaint.getSquareFeet(l, w);

        assertEquals(want, got);

    }

    @Test
    public void getGallonsNeedTest() {
        squareFeet = 360;
        int want = 2;
        int got = CalcPaint.getQtdGallonsNeed(squareFeet);

        assertEquals(want, got);

    }
}
