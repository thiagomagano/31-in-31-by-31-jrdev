package com.thiagomagano;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    Room room = new Room(15, 20);

    @Test
    public void calculateAreaRoom() {
        double want = 300;
        double got = room.calcSquareFeet();

        assertEquals(want, got, 0.001);
    }

    @Test
    public void convertAreaToMeeter() {
        BigDecimal want = new BigDecimal("27.871");
        BigDecimal got = room.convertAreaToMeters();

        assertEquals(want, got);
    }
}
