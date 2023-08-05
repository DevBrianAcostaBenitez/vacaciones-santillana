package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    public void testIsLeapYear() {
        assertEquals(true, Exercise2.isLeapYear(2000));
        assertEquals(true, Exercise2.isLeapYear(2004));
        assertEquals(true, Exercise2.isLeapYear(2012));
        assertEquals(true, Exercise2.isLeapYear(2020));

        assertEquals(false, Exercise2.isLeapYear(1900));
        assertEquals(false, Exercise2.isLeapYear(2001));
        assertEquals(false, Exercise2.isLeapYear(2019));
        assertEquals(false, Exercise2.isLeapYear(2100));
    }
}
