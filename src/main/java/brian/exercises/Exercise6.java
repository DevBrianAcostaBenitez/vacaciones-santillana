package brian.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static int countDigits(int number) {
        return (number == 0) ? 1 : (int) Math.floor(Math.log10(Math.abs(number))) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int number = sc.nextInt();

        System.out.println(number + " tiene " + countDigits(number) + " digitos.");

        sc.close();
    }
}
