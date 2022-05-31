package org.example.case6;

import org.example.util.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class Problem6 {


    public ListNode mergeTwoLists(ListNode arg0, ListNode arg1) {

        return internalMerge(arg0, arg1);
    }

    private static ListNode internalMerge(ListNode arg0, ListNode arg1) {

        if((arg0 == null) && (arg1 == null)) {
            return null;
        }

        int value = Integer.MIN_VALUE;
        int value0 = (arg0 == null) ? Integer.MAX_VALUE : arg0.val;
        int value1 = (arg1 == null) ? Integer.MAX_VALUE : arg1.val;

        if(value0 < value1) {
            value = value0;
            arg0 = arg0.next;
        }else {
            value = value1;
            arg1 = arg1.next;
        }
        return new ListNode(value, internalMerge(arg0, arg1));
    }
}
