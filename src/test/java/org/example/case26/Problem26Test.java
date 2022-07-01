package org.example.case26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem26Test {

    @Test
    void testPositive1() {
        assertEquals(5, new Problem26().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void testPositive2() {
        assertEquals(0, new Problem26().maxProfit(new int[]{7,6,4,3,1}));
    }
}
