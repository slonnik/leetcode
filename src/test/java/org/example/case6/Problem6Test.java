package org.example.case6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem6Test {
    @Test
    void positiveTest() {
        assertArrayEquals(new int []{1,1,2,3,4,4}, new Problem6()
                .concat(new int[] {1,2,4}, new int[] {1,3,4}));
    }

    @Test
    void positiveTest2() {
        assertArrayEquals(new int []{}, new Problem6()
                .concat(new int[] {}, new int[] {}));
    }

    @Test
    void positiveTest3() {
        assertArrayEquals(new int []{}, new Problem6()
                .concat(new int[] {0}, new int[] {}));
    }
}
