package org.example.case7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem7Test {

    @Test
    void testPositive() {
        int[] input = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] expected = new int[] {0,1,2,3,4};

        int result = new Problem7().removeDuplicates(input);
        assertEquals(5, result);
        assertArrayEquals(expected, Arrays.copyOf(input, result));
    }

    @Test
    void testPositive2() {
        int[] input = new int[]{1,1,2};
        int[] expected = new int[] {1,2};

        int result = new Problem7().removeDuplicates(input);
        assertEquals(2, result);
        assertArrayEquals(expected, Arrays.copyOf(input, result));
    }
}
