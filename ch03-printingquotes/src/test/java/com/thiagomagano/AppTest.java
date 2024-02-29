package com.thiagomagano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void quoteTest() {
        Quote q = new Quote("These aren't the droids you're looking for.", "Obi-Wan Kenobi");
        String want = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        assertEquals(want, q.printQuote("", ""));
    }
}
