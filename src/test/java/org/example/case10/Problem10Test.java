package org.example.case10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem10Test {

    @Test
    void testPositive() {

        assertEquals(2, new Problem10().searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    void testPositive2() {

        assertEquals(1, new Problem10().searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    void testPositive3() {

        assertEquals(4, new Problem10().searchInsert(new int[]{1,3,5,6}, 7));
    }
}
