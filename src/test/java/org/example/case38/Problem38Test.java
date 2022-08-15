package org.example.case38;

import org.example.util.ListNode;
import org.example.util.ListNodeTestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem38Test {

    @Test
    void testPositive1() {
        var input = ListNodeTestUtils.from(1, 2, 6, 3, 4, 5, 6);
        var result = new Problem38().removeElements(input, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ListNodeTestUtils.toArray(result));
    }

    @Test
    void testPositive2() {
        var input = new ListNode(6);
        var result = new Problem38().removeElements(input, 6);
        assertEquals(null, result);
    }

    @Test
    void testPositive3() {
        var result = new Problem38().removeElements(null, 6);
        assertEquals(null, result);
    }

    @Test
    void testPositive4() {
        var input = ListNodeTestUtils.from(6, 6, 1, 2, 6, 3, 4, 5, 6, 6);
        var result = new Problem38().removeElements(input, 6);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ListNodeTestUtils.toArray(result));
    }
}
