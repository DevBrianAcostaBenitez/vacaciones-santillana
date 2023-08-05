package brian.exercises;

import java.util.Scanner;

public class Exercise4 {
    public int[] generateFibonacciNumbers(int n) {
        int[] fibonacciNumbers = new int[n];
        fibonacciNumbers[0] = 0;

        if (n > 1) {
            fibonacciNumbers[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce el numero de numeros fibonaci que uiqeres ver: ");
        int n = sc.nextInt();

       
            Exercise4 exercise4 = new Exercise4();
            int[] fibonacciNumbers = exercise4.generateFibonacciNumbers(n);

            System.out.println("los primeros " + n + " de fibonaci son:");
            for (int fibonacciNumber : fibonacciNumbers) {
                System.out.print(fibonacciNumber + " ");
            }
        

        sc.close();
    }
}
