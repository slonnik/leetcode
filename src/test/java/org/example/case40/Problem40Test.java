package org.example.case40;

import org.example.util.ListNodeTestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem40Test {

    @Test
    void testPositive1() {
        var head = ListNodeTestUtils.from(1, 2, 3, 4, 5);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNodeTestUtils.toArray(new Problem40().reverseList(head)));
    }
}
