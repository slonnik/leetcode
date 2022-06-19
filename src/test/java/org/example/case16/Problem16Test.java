package org.example.case16;

import org.example.util.ListNodeTestUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Problem16Test {

    @Test
    void testPositive1() {
        var result = new Problem16().deleteDuplicates(ListNodeTestUtils.from(1, 1, 2));
        assertArrayEquals(new int[]{1, 2}, ListNodeTestUtils.toArray(result));
    }

    @Test
    void testPositive2() {
        var result = new Problem16().deleteDuplicates(ListNodeTestUtils.from(1,1,2,3,3));
        assertArrayEquals(new int[]{1, 2, 3}, ListNodeTestUtils.toArray(result));
    }

    @Test
    void testPositive3() {
        var result = new Problem16().deleteDuplicates(ListNodeTestUtils.from(1,1,1));
        assertArrayEquals(new int[]{1}, ListNodeTestUtils.toArray(result));
    }
}


