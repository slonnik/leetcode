package org.example.case15;

import org.example.util.ListNode;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class Problem15 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode item = null;
        ListNode result = null;
        ListNode node = null;
        while ((node = internal(lists)) != null) {

            if(item == null) {
                result = new ListNode(node.val);
                item = result;
            }else {
                item.next = new ListNode(node.val);
                item = item.next;
            }
        }
        return result;
    }

    private ListNode internal(ListNode[] lists) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < lists.length; ++i) {
            ListNode node = lists[i];
            int curValue = (node == null) ? Integer.MAX_VALUE : node.val;
            if (minValue > curValue) {
                minValue = curValue;
                minIndex = i;
            }
        }
        if (minIndex == -1) {
            return null;
        }
        ListNode result = lists[minIndex];
        lists[minIndex] = lists[minIndex].next;
        result.next = null;
        return result;
    }
}
