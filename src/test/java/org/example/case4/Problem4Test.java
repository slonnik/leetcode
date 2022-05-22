package org.example.case4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem4Test {

    @Test
    void testPrefix() {
        assertEquals("fl", new Problem4().test("flower","flow","flight"));
    }

    @Test
    void testPrefix_negative() {
        assertEquals("", new Problem4().test("dog","racecar","car"));
    }
}

