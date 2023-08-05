package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Exercise6Test {

    @Test
    public void testCountDigits() {
        assertEquals(1, Exercise6.countDigits(0));
        assertEquals(1, Exercise6.countDigits(5));
        assertEquals(2, Exercise6.countDigits(99));
        assertEquals(3, Exercise6.countDigits(789));
        assertEquals(4, Exercise6.countDigits(1234));
        assertEquals(6, Exercise6.countDigits(123456));
        assertEquals(9, Exercise6.countDigits(123456789));
    }
}
