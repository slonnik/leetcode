package org.example.case12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem12Test {

    @Test
    void testPositive1() {
        assertEquals(4, new Problem12().lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void testPositive2() {
        assertEquals(5, new Problem12().lengthOfLastWord("Hello World"));
    }

    @Test
    void testPositive3() {
        assertEquals(0, new Problem12().lengthOfLastWord(""));
    }

    @Test
    void testPositive4() {
        assertEquals(0, new Problem12().lengthOfLastWord("  "));
    }


}
