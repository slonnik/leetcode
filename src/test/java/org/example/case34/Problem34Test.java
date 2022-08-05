package org.example.case34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem34Test {

    @Test
    void testPositive1() {
        assertEquals("A", new Problem34().convertToTitle(1));
    }

    @Test
    void testPositive2() {
        assertEquals("AB", new Problem34().convertToTitle(28));
    }

    @Test
    void testPositive3() {
        assertEquals("ZY", new Problem34().convertToTitle(701));
    }

    @Test
    void testPositive4() {
        assertEquals("FXSHRXW", new Problem34().convertToTitle(2147483647));
    }

    @Test
    void testPositive5() {
        assertEquals("AZ", new Problem34().convertToTitle(52));
    }


}
