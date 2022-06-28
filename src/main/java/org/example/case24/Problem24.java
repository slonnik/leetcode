package org.example.case24;

import org.example.util.TreeNode;

/**
 * https://leetcode.com/problems/path-sum/
 */
public class Problem24 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root != null && root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        TreeNode[] data = new TreeNode[]{null};
        internalSum(root, targetSum, data);
        return data[0] != null && data[0] != root;
    }

    private void internalSum(TreeNode root, int targetSum, TreeNode[] data) {
        if (root == null || data[0] != null) {
            return;
        }
        targetSum -= root.val;
        if (targetSum == 0) {
            data[0] = root;
            return;
        }
        internalSum(root.left, targetSum, data);
        internalSum(root.right, targetSum, data);
    }
}
