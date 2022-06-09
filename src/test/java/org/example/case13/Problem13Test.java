package org.example.case13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem13Test {


    @Test
    void testPositive1() {
        assertArrayEquals(new int[]{5, 6, 7}, new Problem13().plusOne(new int[]{5, 6, 6}));
    }

    @Test
    void testPositive2() {
        assertArrayEquals(new int[]{1, 0, 0}, new Problem13().plusOne(new int[]{9, 9}));
    }

    @Test
    void testPositive3() {
        assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, new Problem13().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }

    @Test
    void testPositive4() {
        assertArrayEquals(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4}, new Problem13().plusOne(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3}));
    }


}
