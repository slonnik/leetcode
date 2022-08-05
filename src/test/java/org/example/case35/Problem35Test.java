package org.example.case35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem35Test {

    @Test
    void testPositive1() {
        assertEquals(3, new Problem35().majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    void testPositive2() {
        assertEquals(2, new Problem35().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
