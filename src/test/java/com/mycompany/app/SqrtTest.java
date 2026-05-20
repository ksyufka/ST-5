package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SqrtTest {
    private static final double EPSILON = 0.0001;

    @Test
    void averageReturnsMeanOfTwoPositiveNumbers() {
        Sqrt sqrt = new Sqrt(2.0);

        assertEquals(3.0, sqrt.average(2.0, 4.0), EPSILON);
    }

    @Test
    void averageReturnsMeanWhenNumbersAreNegative() {
        Sqrt sqrt = new Sqrt(2.0);

        assertEquals(-3.0, sqrt.average(-2.0, -4.0), EPSILON);
    }

    @Test
    void goodReturnsTrueForAccurateGuess() {
        Sqrt sqrt = new Sqrt(4.0);

        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    void goodReturnsFalseForInaccurateGuess() {
        Sqrt sqrt = new Sqrt(4.0);

        assertFalse(sqrt.good(3.0, 4.0));
    }

    @Test
    void improveReturnsBetterGuessForSquareRootOfTwo() {
        Sqrt sqrt = new Sqrt(2.0);

        assertEquals(1.5, sqrt.improve(1.0, 2.0), EPSILON);
    }

    @Test
    void improveKeepsExactGuessForPerfectSquare() {
        Sqrt sqrt = new Sqrt(9.0);

        assertEquals(3.0, sqrt.improve(3.0, 9.0), EPSILON);
    }

    @Test
    void iterCalculatesSquareRootFromInitialGuess() {
        Sqrt sqrt = new Sqrt(2.0);

        assertEquals(Math.sqrt(2.0), sqrt.iter(1.0, 2.0), EPSILON);
    }

    @Test
    void iterReturnsGuessWhenItIsAlreadyGood() {
        Sqrt sqrt = new Sqrt(9.0);

        assertEquals(3.0, sqrt.iter(3.0, 9.0), EPSILON);
    }

    @Test
    void calcCalculatesSquareRootOfTwo() {
        Sqrt sqrt = new Sqrt(2.0);

        assertEquals(Math.sqrt(2.0), sqrt.calc(), EPSILON);
    }

    @Test
    void calcCalculatesSquareRootOfPerfectSquare() {
        Sqrt sqrt = new Sqrt(25.0);

        assertEquals(5.0, sqrt.calc(), EPSILON);
    }

    @Test
    void calcCalculatesSquareRootOfFraction() {
        Sqrt sqrt = new Sqrt(0.25);

        assertEquals(0.5, sqrt.calc(), EPSILON);
    }
}
