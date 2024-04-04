package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class PalindromeTest {
    private Palindrome palindrome;
    @BeforeEach
    void SetUp() {
        palindrome = new Palindrome();
    }


    @Test
    public void testIsPalindromeaprescorrectionWithOneWord() {
        assertEquals(true, palindrome.isPalindromeaprescorrection("ressasser"));
    }

    @Test
    public void testIsPalindromeaprescorrection() {
        assertEquals(true, palindrome.isPalindromeaprescorrection("été"));
    }


    @Test
    public void testIsPalindromeaprescorrectionWithNonPalindromeWord() {

        assertEquals(false, palindrome.isPalindromeaprescorrection("sami"));
    }


    @Test
    void IsPalindrome_withNullString_shouldThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

}