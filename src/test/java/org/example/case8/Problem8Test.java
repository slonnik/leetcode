package org.example.case8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem8Test {

    @Test
    void testPositive() {
        var input = new int[]{3,2,2,3};
        var expectedOutPut = new int[]{2, 2};
        var length = new Problem8().removeElement(input, 3);
        assertEquals(expectedOutPut.length, length);

        Arrays.sort(expectedOutPut);
        input = Arrays.copyOf(input, length);
        Arrays.sort(input);
        assertArrayEquals(expectedOutPut, input);
    }

    @Test
    void testPositive2() {
        var input = new int[]{0,1,2,2,3,0,4,2};
        var expectedOutPut = new int[]{0,1,4,0,3};
        var length = new Problem8().removeElement(input, 2);
        assertEquals(expectedOutPut.length, length);

        Arrays.sort(expectedOutPut);
        input = Arrays.copyOf(input, length);
        Arrays.sort(input);
        assertArrayEquals(expectedOutPut, input);
    }
}
