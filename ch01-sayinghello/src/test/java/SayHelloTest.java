import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.thiagomagano.SayHello;

public class SayHelloTest {

    @Test
    public void ShouldSayHelloCorrect() {
        String name = "Brian";
        String want = String.format("Hello, %s, nice to meet you!", name);
        String got = SayHello.greeting(name);

        assertEquals(want, got);
    }
}
