import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    @Test
    public void testRandomGreetings() {
        String name = "Magano";

        for (int i = 0; i < 1000; i++) {
            String greeting = SayHello.randomGreeting(name);

            assertTrue(greeting.contains(name));

            assertTrue(
                    greeting.equals("Hello " + name + ", nice to meet you!") ||
                            greeting.equals("Hi " + name + ", Good to see you!") ||
                            greeting.equals("Oi " + name + ", Aqui é do Brasil!") ||
                            greeting.equals("Hola! " + name + ", aquí es de México!") ||
                            greeting.equals("Salut " + name + ", ici est de France!"));

        }

    }
}
