package org.example.case6;

public class Problem6 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode mergeTwoLists(ListNode arg0, ListNode arg1) {
        int[] result = new int[arg0.length + arg1.length];
        internal(result, 0, arg0, 0, arg1, 0);
        return result;
    }

    private static void internal(ListNode result,
                                 ListNode arg0,
                                 ListNode arg1) {

        if (posResult >= result.length) {
            return;
        }

        int val0 = arg0.val;
        int val1 = arg1.val;

        if (val0 < val1) {
            result.
        } else {
            result[posResult] = val1;
            posArg1++;
        }
        internal(result, ++posResult, arg0, posArg0, arg1, posArg1);
    }
}
