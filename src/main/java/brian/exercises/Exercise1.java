package brian.exercises;

import java.time.Month;
import java.time.YearMonth;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el numero del mes (1-12): ");
        int monthNumber = sc.nextInt();

        Locale spanishLocale = new Locale("es", "ES");
        String monthInfo = getMonthInfo(monthNumber, spanishLocale);
        System.out.println(monthInfo);

        sc.close();
    }

    public static String getMonthInfo(int monthNumber, Locale locale) {
        Month month = Month.of(monthNumber);
        String monthName = month.getDisplayName(java.time.format.TextStyle.FULL, locale);

        YearMonth yearMonth = YearMonth.of(YearMonth.now().getYear(), monthNumber);
        int numberOfDays = yearMonth.lengthOfMonth();

        return "El mes es " + monthName + " y tiene " + numberOfDays + " dias.";
    }
}
