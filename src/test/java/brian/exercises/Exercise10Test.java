package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Exercise10Test {

    @Test
    public void testFindCommonElements() {
        int[] arr1 = {1, 2, 3, 3, 4, 4, 5, 2};
        int[] arr2 = {2, 3, 4, 6, 10, 9};
        Integer[] expectedCommonElements = {2, 3, 4};

        Integer[] actualCommonElements = Exercise10.findCommonElements(arr1, arr2);

        assertArrayEquals(expectedCommonElements, actualCommonElements);
    }

    @Test
    public void testFindCommonElementsWithEmptyArrays() {
        int[] arr1 = {5,4,2,1,9};
        int[] arr2 = {2,3,55};
        Integer[] expectedCommonElements = {2};

        Integer[] actualCommonElements = Exercise10.findCommonElements(arr1, arr2);

        assertArrayEquals(expectedCommonElements, actualCommonElements);
    }

    @Test
    public void testFindCommonElementsWithNoCommonElements() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        Integer[] expectedCommonElements = {};

        Integer[] actualCommonElements = Exercise10.findCommonElements(arr1, arr2);

        assertArrayEquals(expectedCommonElements, actualCommonElements);
    }
}
