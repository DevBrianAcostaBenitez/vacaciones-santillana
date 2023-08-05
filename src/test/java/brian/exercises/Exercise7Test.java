package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Exercise7Test {

    @Test
    public void testCountGradesAboveThree() {
        double[] grades1 = {4.5, 2.8, 3.1, 2.9, 3.5};
        assertEquals(3, Exercise7.countGradesAboveThree(grades1));

        double[] grades2 = {2.5, 2.0, 3.2, 3.0, 3.8};
        assertEquals(3, Exercise7.countGradesAboveThree(grades2));

        double[] grades3 = {2.0, 2.5, 1.8, 3.5, 3.6};
        assertEquals(2, Exercise7.countGradesAboveThree(grades3));
    }
}
