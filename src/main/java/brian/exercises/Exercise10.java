package brian.exercises;

import java.util.HashSet;
import java.util.Set;

public class Exercise10 {

    public static Integer[] findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        return set1.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 3, 4, 4, 5,2};
        int[] array2 = {2, 3, 4,6,10,9};

        Integer[] commonElements = findCommonElements(array1, array2);

        System.out.print("Los elementos comunes son: ");
        for (int i = 0; i < commonElements.length; i++) {
            System.out.print(commonElements[i]);
            if (i < commonElements.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
