package brian.exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero ");
        int number = sc.nextInt();

        boolean isArmstrong = isArmstrongNumber(number);

        if (isArmstrong) {
            System.out.println(number + " Es un numero de armstrong.");
        } else {
            System.out.println(number + " No es un numero de armstrong.");
        }

        sc.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int sum = 0;
        int temp = number;
        int numDigits = (int) Math.floor(Math.log10(number)) + 1;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum == number;
    }
}
