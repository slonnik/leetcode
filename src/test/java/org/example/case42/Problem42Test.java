package org.example.case42;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem42Test {

    @Test
    void testPositive1() {
        assertTrue(new Problem42().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    void testPositive2() {
        assertTrue(new Problem42().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    @Test
    void testNegative1() {
        assertFalse(new Problem42().containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}
