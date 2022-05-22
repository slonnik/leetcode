package org.example.case5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem5Test {

    @Test
    void testPositive() {
        //assertTrue(new Problem5().isValid("({})"));
        assertTrue(new Problem5().isValid("({[]})"));
    }

    @Test
    void testPositive2() {
        assertTrue(new Problem5().isValid("()[]{}"));
    }

    @Test
    void testPositive3() {
        assertTrue(new Problem5().isValid("(([]){})"));
    }

    @Test
    void testNegative() {
        assertFalse(new Problem5().isValid("(}"));
    }
}
