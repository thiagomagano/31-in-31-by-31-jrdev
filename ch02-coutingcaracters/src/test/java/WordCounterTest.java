import com.thiagomagano.WordCounter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WordCounterTest {

    @Test
    public void shouldCountWordCorrect() {
        String word = "Homer";
        int want = 5;
        int got = WordCounter.wordCount(word);

        assertEquals(want, got);
    }
}
