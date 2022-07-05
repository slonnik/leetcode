package org.example.case29;

import org.example.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class Problem29 {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        final int MAX_LENGTH = 10_010;
        int count = 1;
        while(head.next != null) {
            count++;
            if(count > MAX_LENGTH)
            {
                return  true;
            }
            head = head.next;
        }
        return false;
    }
}
