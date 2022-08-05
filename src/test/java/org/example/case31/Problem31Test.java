package org.example.case31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem31Test {

    @Test
    void testPositive1() {
        var problem = new Problem31();
        problem.data = "abc".toCharArray();
        char[] data = new char[4];
        var result = problem.read(data, 4);
        assertEquals(3, result);
        assertArrayEquals(new char[] {'a', 'b', 'c', 0}, data);
    }

    @Test
    void testPositive2() {
        var problem = new Problem31();
        problem.data = "abcde".toCharArray();
        char[] data = new char[5];
        var result = problem.read(data, 5);
        assertEquals(5, result);
        assertArrayEquals(new char[] {'a', 'b', 'c', 'd', 'e'}, data);
    }

    @Test
    void testPositive3() {
        var problem = new Problem31();
        problem.data = "abcdABCD1234".toCharArray();
        char[] data = new char[12];
        var result = problem.read(data, 12);
        assertEquals(12, result);
        assertArrayEquals("abcdABCD1234".toCharArray(), data);
    }

    @Test
    void testPositive4() {
        var problem = new Problem31();
        problem.data = "leetcode".toCharArray();
        char[] data = new char[5];
        var result = problem.read(data, 5);
        assertEquals(5, result);
        assertArrayEquals("leetc".toCharArray(), data);
    }
}
