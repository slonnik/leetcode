package org.example.case40;

import org.example.util.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class Problem40 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            var next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }


}
