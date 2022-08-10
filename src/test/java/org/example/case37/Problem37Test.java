package org.example.case37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem37Test {

    @Test
    void testPositive1() {
        int result = Integer.parseUnsignedInt("00000000000000000000000000001011", 2);
        assertEquals(3, new Problem37().hammingWeight(result));
    }

    @Test
    void testPositive2() {
        int result = Integer.parseUnsignedInt("00000000000000000000000010000000", 2);
        assertEquals(1, new Problem37().hammingWeight(result));
    }

    @Test
    void testPositive3() {
        int result = Integer.parseUnsignedInt("11111111111111111111111111111101", 2);
        assertEquals(31, new Problem37().hammingWeight(result));
    }
}
