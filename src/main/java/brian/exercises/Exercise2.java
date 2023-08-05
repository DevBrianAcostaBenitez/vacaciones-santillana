package brian.exercises;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un año : ");
        int year = sc.nextInt();

        boolean isLeapYear = isLeapYear(year);

        if (isLeapYear) {
            System.out.println(year + " es bisiesto.");
        } else {
            System.out.println(year + " no es bisiesto.");
        }

        sc.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
