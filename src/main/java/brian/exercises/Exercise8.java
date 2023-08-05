package brian.exercises;

import java.util.Scanner;

public class Exercise8 {

    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean areAmicableNumbers(int number1, int number2) {
        return sumOfDivisors(number1) == number2 && sumOfDivisors(number2) == number1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int number1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int number2 = sc.nextInt();

        if (areAmicableNumbers(number1, number2)) {
            System.out.println(number1 + " y " + number2 + " son numeros amigos.");
        } else {
            System.out.println(number1 + " y " + number2 + " son numeros amigos.");
        }

        sc.close();
    }
}
