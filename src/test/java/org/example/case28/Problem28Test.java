package org.example.case28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem28Test {

    @Test
    void testPositive1() {
        assertEquals(1, new Problem28().singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void testPositive2() {
        assertEquals(4, new Problem28().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    void testPositive3() {
        assertEquals(1, new Problem28().singleNumber(new int[]{1}));
    }
}
