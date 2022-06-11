package org.example.case14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem14Test {

    @Test
    void testPositive1() {
       assertEquals("100", new Problem14().addBinary("11", "1"));
    }

    @Test
    void testPositive2() {
        assertEquals("10101", new Problem14().addBinary("1010", "1011"));
    }
}
