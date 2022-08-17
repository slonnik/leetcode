package org.example.case39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem39Test {

    @Test
    void testPositive1() {
        assertTrue(new Problem39().isIsomorphic("egg", "add"));
    }

    @Test
    void testNegative1() {
        assertFalse(new Problem39().isIsomorphic("foo", "bar"));
    }

    @Test
    void testPositive2() {
        assertTrue(new Problem39().isIsomorphic("paper", "title"));
    }

    @Test
    void testNegative2() {
        assertFalse(new Problem39().isIsomorphic("baba", "badc"));
    }

    @Test
    void testNegative3() {
        assertFalse(new Problem39().isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    @Test
    void testNegative4() {
        assertFalse(new Problem39().isIsomorphic("badc", "baba"));
    }
}

