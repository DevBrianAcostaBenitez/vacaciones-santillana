package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.time.Month;
import java.time.YearMonth;
import java.util.Locale;

public class Exercise1Test {

    @Test
    public void testGetMonthInfo() {
        Locale spanishLocale = new Locale("es", "ES");

        for (int monthNumber = 1; monthNumber <= 12; monthNumber++) {
            Month month = Month.of(monthNumber);
            String expectedMonthName = month.getDisplayName(java.time.format.TextStyle.FULL, spanishLocale);
            YearMonth yearMonth = YearMonth.of(YearMonth.now().getYear(), monthNumber);
            int expectedNumberOfDays = yearMonth.lengthOfMonth();

            String actualMonthInfo = Exercise1.getMonthInfo(monthNumber, spanishLocale);

            String expectedMonthInfo = "El mes es " + expectedMonthName + " y tiene " + expectedNumberOfDays + " dias.";

            assertEquals(expectedMonthInfo, actualMonthInfo);
        }
    }
}
