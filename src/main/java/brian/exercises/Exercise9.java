package brian.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise9 {

    public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> duplicatesList = new ArrayList<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicatesList.add(entry.getKey());
            }
        }

        return duplicatesList;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 3, 6, 7, 8, 1, 9, 10, 2 };
        List<Integer> duplicates = findDuplicates(numbers);

        System.out.print("Los elementos duplicados son: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}
