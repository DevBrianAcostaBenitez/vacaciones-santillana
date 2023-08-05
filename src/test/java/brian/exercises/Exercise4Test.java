package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Exercise4Test {

    @Test
    public void testGenerateFibonacciNumbers() {
        Exercise4 exercise4 = new Exercise4();

       
        int[] expected1 = {0};
        int[] actual1 = exercise4.generateFibonacciNumbers(1);
        assertArrayEquals(expected1, actual1);

        
        int[] expected5 = {0, 1, 1, 2, 3};
        int[] actual5 = exercise4.generateFibonacciNumbers(5);
        assertArrayEquals(expected5, actual5);

       
        int[] expected10 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] actual10 = exercise4.generateFibonacciNumbers(10);
        assertArrayEquals(expected10, actual10);

      
        int[] expected20 = {
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
        };
        int[] actual20 = exercise4.generateFibonacciNumbers(20);
        assertArrayEquals(expected20, actual20);
    }
}