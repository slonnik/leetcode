package org.example.case32;

import org.example.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem32Test {

    @Test
    void testPositive1() {
        var intersectNode = new ListNode(8, new ListNode(4, new ListNode(5)));
        var nodeOne = new ListNode(4, new ListNode(1, intersectNode));
        var nodeTwo = new ListNode(5, new ListNode(6, new ListNode(1, intersectNode)));
        assertEquals(intersectNode, new Problem32().getIntersectionNode(nodeOne, nodeTwo));
    }

    @Test
    void testPositive2() {
        var intersectNode = new ListNode(2, new ListNode(4));
        var nodeOne = new ListNode(1, new ListNode(9, new ListNode(1, intersectNode)));
        var nodeTwo = new ListNode(3, intersectNode);
        assertEquals(intersectNode, new Problem32().getIntersectionNode(nodeOne, nodeTwo));
    }

    @Test
    void testPositive3() {
        var nodeOne = new ListNode(2, new ListNode(6, new ListNode(4)));
        var nodeTwo = new ListNode(1, new ListNode(5));
        assertEquals(null, new Problem32().getIntersectionNode(nodeOne, nodeTwo));
    }
}
