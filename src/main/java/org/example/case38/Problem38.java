package org.example.case38;


import org.example.util.ListNode;

public class Problem38 {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null) {
            if (head.val != val) {
                break;
            }
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        var result = head;
        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return result;
    }
}
