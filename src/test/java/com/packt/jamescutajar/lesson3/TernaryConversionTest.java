package com.packt.jamescutajar.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TernaryConversionTest {
    @Test
    public void testConvert123() {
        assertEquals("11120", new TernaryConversion().convert(123), "123 converted to Ternary should be 11120");
    }

    @Test
    public void testConvert178() {
        assertEquals("20121", new TernaryConversion().convert(178), "178 converted to Ternary should be 20121");
    }

    @Test
    public void testConvert7463() {
        assertEquals("101020102", new TernaryConversion().convert(7463), "7463 converted to Ternary should be 101020102");
    }

    @Test
    public void testConvert1() {
        assertEquals("1", new TernaryConversion().convert(1), "1 converted to Ternary should be 1");
    }

    @Test
    public void testConvert0() {
        assertEquals("0", new TernaryConversion().convert(0), "0 converted to Ternary should be 0");
    }

    @Test
    public void testConvert2() {
        assertEquals("2", new TernaryConversion().convert(2), "2 converted to Ternary should be 2");
    }

    @Test
    public void testConvert3() {
        assertEquals("10", new TernaryConversion().convert(3), "3 converted to Ternary should be 10");
    }

    @Test
    public void testConvert5() {
        assertEquals("12", new TernaryConversion().convert(5), "5 converted to Ternary should be 12");
    }
}
