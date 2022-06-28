package org.example.case23;

import org.example.util.TreeNode;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class Problem23 {

    public int minDepth(TreeNode root) {
        int[] data = new int[]{Integer.MAX_VALUE};
        if(root == null) {
            return 0;
        }
        internalDepth(data, 0, root);
        return data[0];
    }

    private void internalDepth(int[] data, int count, TreeNode node) {
        if (node == null) {
            return;
        }
        ++count;
        if (node.left == null && node.right == null) {
            if (data[0] > count) {
                data[0] = count;
            }
            return;
        }

        internalDepth(data, count, node.left);
        internalDepth(data, count, node.right);
    }
}
