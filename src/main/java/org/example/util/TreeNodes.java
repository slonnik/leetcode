package org.example.util;


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
        var rightPos = 2 * currPos + 2;
        var leftPos = rightPos - 1;

        if (currPos >= nodes.length) {
            return null;
        }
        if (nodes[currPos] == Integer.MIN_VALUE) {
            return null;
        }
        TreeNode leftNode = internalFrom(leftPos, nodes);
        TreeNode rightNode = internalFrom(rightPos, nodes);

        return new TreeNode(nodes[currPos], leftNode, rightNode);
    }


    public static int[] to(TreeNode node) {
        int count = internalCount(node, null);
        int[] data = new int[count];

        internalTo(0, data, node);
        return data;
    }

    private static int internalCount(TreeNode node, TreeNode arg0) {
        if (node != null) {
            return 1 + internalCount(node.left, node.right) + internalCount(node.right, node.left);
        }
        return (arg0 != null) ? 1 : 0;
    }

    private static void internalTo(int currPoss, int[] data, TreeNode node) {

        if(node == null || currPoss < data.length) {
            data[currPoss] = Integer.MIN_VALUE;
            return;
        }

        data[currPoss] = node.val;
        internalTo(2 * currPoss + 1, data, node.left);
        internalTo(2 * currPoss + 2, data, node.right);
    }
}
