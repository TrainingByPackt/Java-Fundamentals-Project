package com.packt.jamescutajar.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearCheckTest {

    @Test
    public void testLeapYearCheck2000() {
        assertTrue(new LeapYearCheck().isLeapYear(2000), "2000 should be a leap year");
    }

    @Test
    public void testLeapYearCheck3000() {
        assertFalse(new LeapYearCheck().isLeapYear(3000), "3000 should not be a leap year");
    }

    @Test
    public void testLeapYearCheck1997() {
        assertFalse(new LeapYearCheck().isLeapYear(1997), "1997 should not be a leap year");
    }

    @Test
    public void testLeapYearCheck1980() {
        assertTrue(new LeapYearCheck().isLeapYear(1980), "1980 should be a leap year");
    }

    @Test
    public void testLeapYearCheck2016() {
        assertTrue(new LeapYearCheck().isLeapYear(2016), "2016 should be a leap year");
    }

    @Test
    public void testLeapYearCheck2500() {
        assertFalse(new LeapYearCheck().isLeapYear(2500), "2500 should not be a leap year");
    }
}
