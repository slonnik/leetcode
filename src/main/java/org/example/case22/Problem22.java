package org.example.case22;

import org.example.util.TreeNode;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class Problem22 {

    public boolean isBalanced(TreeNode root) {
        return internalBalanced(root);
    }


    private boolean internalBalanced(TreeNode node) {
        if(node == null) {
            return true;
        }
        var result = Math.abs(maxDepth(node.right) - maxDepth(node.left));
        if(result > 1) {
            return false;
        }
        return internalBalanced(node.left) && internalBalanced(node.right);
    }

    private int maxDepth(TreeNode root) {
        int[] data = new int[] {0};
        internalDepth(data, 0, root);
        return data[0];
    }

    private void internalDepth(int[] data, int count, TreeNode node) {
        if(node == null) {
            return;
        }

        if(data[0] < ++count) {
            data[0] = count;
        }
        internalDepth(data, count, node.left);
        internalDepth(data, count, node.right);
    }
}
