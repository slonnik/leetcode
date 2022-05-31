package org.example.util;

public class ListNodeTestUtils {

    public static ListNode fromArray(int[] array) {
        if(array.length == 0) {
            return new ListNode();
        }
        return internalNode(0, array);
    }

    public static int[] toArray(ListNode node) {
        int length = length(node);
        int[] data = new int[length];
        for(int i =0; i < length; ++i) {
            data[i] = node.val;
            node = node.next;
        }
        return data;
    }

    private static ListNode internalNode(int index, int[] arg0) {
        if(index == arg0.length -1) {
            return new ListNode(arg0[index]);
        }
        return new ListNode(arg0[index], internalNode(++index, arg0));
    }

    private static int length(ListNode node) {
        var length = 0;
        while(node.next != null) {
            length++;
            node = node.next;
        }
        return length + 1;
    }
}
