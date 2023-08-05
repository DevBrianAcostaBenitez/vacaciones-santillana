package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class Exercise8Test {

    @Test
    public void testAreAmicableNumbers() {
        assertTrue(Exercise8.areAmicableNumbers(220, 284));
        assertTrue(Exercise8.areAmicableNumbers(1184, 1210));
        assertTrue(Exercise8.areAmicableNumbers(2620, 2924));
        assertTrue(Exercise8.areAmicableNumbers(5020, 5564));
        
        assertFalse(Exercise8.areAmicableNumbers(220, 221));
        assertFalse(Exercise8.areAmicableNumbers(1184, 1211));
        assertFalse(Exercise8.areAmicableNumbers(2620, 2925));
        assertFalse(Exercise8.areAmicableNumbers(5020, 5565));
    }
}
