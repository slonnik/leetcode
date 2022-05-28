package tinkoff.test1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem1Test {

    @Test
    void positiveTest() {
        assertTrue(new Problem1().validate("([{}])"));
    }
    @Test
    void positiveTest2() {
        assertTrue(new Problem1().validate("([{}]){}[]"));
    }
    @Test
    void positiveTest3() {
        assertTrue(new Problem1().validate(""));
    }

    @Test
    void negativeTest1() {
        assertFalse(new Problem1().validate("]("));
    }
}
