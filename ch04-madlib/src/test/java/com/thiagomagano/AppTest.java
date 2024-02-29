package com.thiagomagano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    @Test
    void madlibTest() {
        Game madlib = new Game("noun", "verb", "adjective", "adverb");

        String want = "Do your verb your adjective noun adverb? That's hilarious";

        String got = madlib.play();

        assertEquals(want, got);
    }
}
