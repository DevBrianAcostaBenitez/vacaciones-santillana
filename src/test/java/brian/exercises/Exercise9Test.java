package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Exercise9Test {

    @Test
    public void testFindDuplicates() {
        int[] numbers1 = { 1, 2, 3, 4, 5, 3, 6, 7, 8, 1, 9, 10, 2 };
        List<Integer> expectedDuplicates1 = Arrays.asList(1, 2, 3);
        List<Integer> actualDuplicates1 = Exercise9.findDuplicates(numbers1);
        assertIterableEquals(expectedDuplicates1, actualDuplicates1);
    }

    @Test
    public void testFindDuplicates2() {
        int[] numbers2 = { 1, 1, 6, 6, 6, 9 };
        List<Integer> expectedDuplicates2 = Arrays.asList(1, 6);
        List<Integer> actualDuplicates2 = Exercise9.findDuplicates(numbers2);
        assertIterableEquals(expectedDuplicates2, actualDuplicates2);
    }

    @Test
    public void testFindDuplicates3() {
        int[] numbers3 = { 2, 4, 6, 8, 10 };
        List<Integer> expectedDuplicates3 = Arrays.asList();
        List<Integer> actualDuplicates3 = Exercise9.findDuplicates(numbers3);
        assertIterableEquals(expectedDuplicates3, actualDuplicates3);
    }
}
