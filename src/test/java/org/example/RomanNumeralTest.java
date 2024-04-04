package org.example;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    private RomanNumeral romanNumeral;

    @BeforeEach
    void SetUp() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    void testRomanNumeralLessThan1() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(-14789));
    }

    @Test
    void testRomanNumeralGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4444444));
    }


    @Test
    void testRomanNumeral100() {
        String expected = "C";
        String returned = RomanNumeral.toRoman(100);
        assertEquals(expected, returned);
    }

    @Test
    void testRomanNumeralfour() {
        String expected = "IV";
        String returned = RomanNumeral.toRoman(4);
        assertEquals(expected, returned);
    }

    @Test
    void testRomanNumeraltwo() {
        String expected = "II";
        String returned = RomanNumeral.toRoman(2);
        assertEquals(expected, returned);
    }

    @Test
    void testRomanNumeraleleven() {
        String expected = "XI";
        String returned = RomanNumeral.toRoman(11);
        assertEquals(expected, returned);
    }

}