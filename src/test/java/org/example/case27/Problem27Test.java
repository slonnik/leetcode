package org.example.case27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem27Test {

    @Test
    void testPositive1() {
        assertTrue(new Problem27().isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void testPositive2() {
        assertTrue(new Problem27().isPalindrome("   "));
    }

    @Test
    void testNegative1() {
        assertFalse(new Problem27().isPalindrome("raceacar"));
    }

    @Test
    void testNegative2() {
        assertFalse(new Problem27().isPalindrome("0P"));
    }
}
