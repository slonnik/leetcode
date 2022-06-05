package org.example.case9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem9Test {

    @Test
    void testPositive() {
        assertEquals(2, new Problem9().strStr("hello", "ll"));
    }

    @Test
    void testPositive2() {
        assertEquals(4, new Problem9().strStr("mississippi", "issip"));
    }

    @Test
    void testPositive3() {
        assertEquals(0, new Problem9().strStr("a", "a"));
    }

    @Test
    void testPositive4() {
        assertEquals(2, new Problem9().strStr("abc", "c"));
    }

    @Test
    void testNegative() {
        assertEquals(-1, new Problem9().strStr("aaaaa", "baa"));
    }
}
