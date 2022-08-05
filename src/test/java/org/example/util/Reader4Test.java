package org.example.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reader4Test {

    @Test
    void testPositive1() {
        var reader = new Reader4();
        reader.data = "tst".toCharArray();
        char[] data = new char[4];
        int result = reader.read4(data);
        assertEquals(3, result);
        assertArrayEquals(new char[]{'t', 's', 't', 0}, data);
    }


    @Test
    void testPositive2() {
        var reader = new Reader4();
        reader.data = "tst1234".toCharArray();
        char[] data = new char[4];
        int result = reader.read4(data);
        assertEquals(4, result);
        assertArrayEquals(new char[]{'t', 's', 't', '1'}, data);
        Arrays.fill(data, (char)0);
        result = reader.read4(data);
        assertEquals(3, result);
        assertArrayEquals(new char[]{'2', '3', '4', 0}, data);
    }
}
