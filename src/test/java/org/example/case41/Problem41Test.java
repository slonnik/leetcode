package org.example.case41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem41Test {

    @Test
    void testPositive1() {
        assertTrue(new Problem41().containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void testNegative1() {
        assertFalse(new Problem41().containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}
