package org.example.util;

import java.util.LinkedList;

public class TreeNodes {

    public static TreeNode from(int... nodes) {
        if (nodes == null) {
            return null;
        }

        if (nodes.length == 0) {
            return new TreeNode();
        }

        if (nodes.length == 1) {
            return new TreeNode(nodes[0]);
        }
        return internalFrom(0, nodes);
    }

    private static TreeNode internalFrom(int currPos, int[] nodes) {
        var rightPos = 2*(currPos+1) ;
        var leftPos = rightPos - 1;

        if(leftPos >= nodes.length) {
            return null;
        }

        return new TreeNode(nodes[currPos], internalFrom(leftPos, nodes), internalFrom(rightPos, nodes));

        //internalFrom(++currPos, nodes);
        //var leftNode =  internalFrom(++currPos, nodes);
        //var rightNode = internalFrom(++currPos, nodes);

        //return null;
    }

    public static int[] to(TreeNode node) {
        //var list = new LinkedList<>();
        //list.add(node.val);
        //list.add(node.left.val);
        //list.add(node.right.val);
        return null;
    }
}
