package brian.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            sumOfDivisors += (number % i == 0) ? i : 0;
        }

        return sumOfDivisors == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int number = sc.nextInt();

        System.out.println(number +  (isPerfectNumber(number) ? " es " : " no es ") + "un numero perfecto.");

        sc.close();
    }
}
