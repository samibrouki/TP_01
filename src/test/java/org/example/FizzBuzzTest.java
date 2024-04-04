package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzzTest;


    @BeforeEach
    void SetUp() {
        fizzBuzzTest = new FizzBuzz();
    }

    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTest.fizzBuzz(-78));
    }


    @Test
    public void testMultiple3() {
        assertEquals("Fizz", fizzBuzzTest.fizzBuzz(9));
    }

    @Test
    public void testMultiple5() {
        assertEquals("Buzz", fizzBuzzTest.fizzBuzz(20));
    }

    @Test
    public void testMultiple3andMultiple5() {
        assertEquals("FizzBuzz", fizzBuzzTest.fizzBuzz(15));
    }

    @Test
    public void testNotAnyMultiple() {
        assertEquals("28", fizzBuzzTest.fizzBuzz(28));
    }
}