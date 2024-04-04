package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {

    private QuadraticEquation quadraticEquation;

    @BeforeEach
    void SetUp() {
        quadraticEquation = new QuadraticEquation();
    }

    @Test
    void testUsingDeltaGreaterThanZero() {
        double a = -4;
        double b = -3;
        double c = 10;
        double[] solution = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(new double[]{(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a), (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)}, solution);
    }


    @Test
    void testUsingDeltaLessThanZero() {
        double a = 5;
        double b = 2;
        double c = 3;
        double[] solution = QuadraticEquation.solve(a, b, c);
        assertNull(solution);
    }

    @Test
    void testUsingDeltaEqualsZero() {
        double a = 1;
        double b = 2;
        double c = 1;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(new double[]{-b / (2 * a)}, roots);
    }

    @Test
    void testUsingaEqualsZero() {
        double a = 0;
        double b = 14;
        double c = 6;
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(a, b, c));
    }

}