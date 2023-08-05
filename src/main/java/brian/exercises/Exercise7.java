package brian.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static int countGradesAboveThree(double[] grades) {
        int countGradesAboveThree = 0;
        for (double grade : grades) {
            countGradesAboveThree += (grade >= 3.0) ? 1 : 0;
        }
        return countGradesAboveThree;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numGrades = 5;
        double[] grades = new double[numGrades];

        for (int i = 0; i < numGrades; i++) {
            System.out.print("añade una nota final" + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        int countGradesAboveThree = countGradesAboveThree(grades);

        System.out.println("numero de notas mayores o iguales a 3.0: " + countGradesAboveThree);

        sc.close();
    }
}
