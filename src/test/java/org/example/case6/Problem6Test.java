package org.example.case6;

import static org.example.util.ListNodeTestUtils.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem6Test {
    @Test
    void positiveTest1() {
        var result = new Problem6().mergeTwoLists(fromArray(new int[]{1, 2, 4}),
                fromArray(new int[]{1, 3, 4}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, toArray(result));
    }

}
