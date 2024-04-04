package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    private Anagram anagram;
    @BeforeEach
    void SetUp() {
        anagram = new Anagram();
    }

    @Test
    void PremierIsNULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "SAMI"));
    }

    @Test
    void DeuxiemeIsNULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("SAMI", null));
    }

    @Test
    void lesdeuxnull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    public void NotTheSameLength() {
        assertFalse(anagram.isAnagram("madrid", "barcelon"));
    }


    @Test
    public void IsAnagram() {
        assertEquals(true, anagram.isAnagram("pirate ", "partie "));
    }


    @Test
    public void NotAnagram() {
        assertFalse(anagram.isAnagram("AEPINGVFDQMV", "ZROVSDKPVFDSVFDVD"));
    }

}