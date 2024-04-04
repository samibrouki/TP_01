package org.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.reflect.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    private BinarySearch binarySearch;
    @BeforeEach
    void SetUp() {
        binarySearch = new BinarySearch();
    }



    @Test
    void TestArrayIsNULL() {
        Array a = null;
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 3));
    }

    @Test
    void TestElementNotInTheArray() {
        int[] array = {-578 , -478 , -36 , 52 , 60 , 785 , 12547};
        int element = 615;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(-1, index);
    }

    @Test
    void TestBinarySearch() {
        int[] array = {-578 , -478 , -36 , 52 , 60 , 785 , 12547};
        int element = 12547;
        int aux = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(6, aux);
    }

    @Test
    void testMidlleofArrayGreaterThanElement() {
        // To Rename later
        int[] array = {-578 , -478 , -36 , 52 , 60 , 785 , 12547};
        int element = -478 ;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(1, index);
    }

    @Test
    void testMidlleofArraylessThanElement() {
        // To Rename later
        int[] array = {-578 , -478 , -36 , 52 , 60 , 785 , 12547};
        int element = 785 ;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(5, index);
    }
}