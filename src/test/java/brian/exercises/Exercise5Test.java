package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Exercise5Test {
    @Test
    public void testIsPerfectNumber() {

        assertEquals(true, Exercise5.isPerfectNumber(6));
        assertEquals(true, Exercise5.isPerfectNumber(28));
        assertEquals(true, Exercise5.isPerfectNumber(496));
        assertEquals(true, Exercise5.isPerfectNumber(8128));

        assertEquals(false, Exercise5.isPerfectNumber(7));
        assertEquals(false, Exercise5.isPerfectNumber(12));
        assertEquals(false, Exercise5.isPerfectNumber(91));
        assertEquals(false, Exercise5.isPerfectNumber(12345));
    }
}
