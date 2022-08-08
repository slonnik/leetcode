package org.example.case36;


import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class Problem36Test {

    @Test
    void positiveTest1() {
        var arg0 = new Problem36.TwoSum();
        arg0.add(5);
        arg0.add(3);
        arg0.add(1);
        assertTrue(arg0.find(4));
        assertFalse(arg0.find(7));
    }

    @Test
    void positiveTest2() {
        var arg0 = new Problem36.TwoSum();
        arg0.add(0);
        arg0.add(0);
        assertTrue(arg0.find(0));

    }

    @Test
    void positiveTest3() {
        var arg0 = new Problem36.TwoSum();
        arg0.add(0);
        assertFalse(arg0.find(0));

    }

    @Test
    void positiveTest4() {
        var arg0 = new Problem36.TwoSum();
        arg0.add(3);
        arg0.add(2);
        arg0.add(1);
        assertFalse(arg0.find(2));

    }
}
