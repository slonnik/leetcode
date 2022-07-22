package org.example.case32;

import org.example.util.ListNode;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class Problem32 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var headASet = new HashSet<>();
        var node = headA;
        while(node != null) {
            headASet.add(node);
            node = node.next;
        }
        node = headB;
        while(node != null) {
            if(headASet.contains(node)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
