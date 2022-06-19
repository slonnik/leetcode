package org.example.case16;

import org.example.util.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class Problem16 {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) {
            return null;
        }
        ListNode result = head;
        internal(head, head.next);
        return result;
    }

    void internal(ListNode startNode, ListNode node) {
        if (node == null) {
            return;
        }
        if (startNode.val != node.val) {
            startNode.next = node;
            internal(node, node.next);
        } else {
            if (node.next == null) {
                startNode.next = null;
            }
            internal(startNode, node.next);
        }
    }
}
