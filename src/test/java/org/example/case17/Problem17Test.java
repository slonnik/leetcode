package org.example.case17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem17Test {

    @Test
    void testPositive1() {
        int[] input = new int[] {1,2,3,0,0,0};
        int[] left = new int[] {2,5,6};
        new Problem17().merge(input, 3, left, 3);
       assertArrayEquals(new int[] {1,2,2,3,5,6}, input);
    }

    @Test
    void testPositive2() {
        int[] input = new int[] {1};
        int[] left = new int[] {};
        new Problem17().merge(input, 1, left, 0);
        assertArrayEquals(new int[] {1}, input);
    }

    @Test
    void testPositive3() {
        int[] input = new int[] {0};
        int[] left = new int[] {1};
        new Problem17().merge(input, 0, left, 1);
        assertArrayEquals(new int[] {1}, input);
    }
}
