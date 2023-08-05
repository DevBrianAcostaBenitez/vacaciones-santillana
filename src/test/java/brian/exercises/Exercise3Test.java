package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Exercise3Test {
    @Test
     public void testIsArmstrongNumber() {
        assertEquals(true, Exercise3.isArmstrongNumber(153));
        assertEquals(true, Exercise3.isArmstrongNumber(370));
        assertEquals(true, Exercise3.isArmstrongNumber(371));
        assertEquals(true, Exercise3.isArmstrongNumber(407));

        assertEquals(false, Exercise3.isArmstrongNumber(123));
        assertEquals(false, Exercise3.isArmstrongNumber(456));
        assertEquals(false, Exercise3.isArmstrongNumber(789));
        assertEquals(false, Exercise3.isArmstrongNumber(1000));
    }
}
