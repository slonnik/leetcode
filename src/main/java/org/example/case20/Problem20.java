package org.example.case20;

import org.example.util.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class Problem20 {

    public int maxDepth(TreeNode root) {
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
