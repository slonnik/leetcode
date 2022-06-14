package org.example.case15;


import org.example.util.ListNode;
import org.example.util.ListNodeTestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem15Test {

    @Test
    void testPositive1() {
        var lists = new ListNode[] {
                ListNodeTestUtils.from(1,4,5),
                ListNodeTestUtils.from(1,3,4),
                ListNodeTestUtils.from(2,6)
        };
        assertArrayEquals( new int[]{1,1,2,3,4,4,5,6}, ListNodeTestUtils.toArray(new Problem15().mergeKLists(lists)));
    }
}
