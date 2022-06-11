package org.example.case15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem15Test {

    @Test
    void testPositive1() {
        assertEquals(2, new Problem15().mySqrt(4));
    }

    @Test
    void testPositive2() {
        assertEquals(2, new Problem15().mySqrt(8));
    }

    @Test
    void testPositive3() {
        assertEquals((int)Math.pow(2147483647, 0.5), new Problem15().mySqrt(2147483647));
    }


}
