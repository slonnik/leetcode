package org.example.case19;

import org.example.util.TreeNode;

/**
 * https://leetcode.com/problems/symmetric-tree/
 */
public class Problem19 {

    public boolean isSymmetric(TreeNode root) {

        if(root == null) {
            return true;
        }

        return internalCheck(root.left, root.right);
    }

    public boolean internalCheck(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q != null) {
            return false;
        }

        if (p != null && q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        if (p.left == null && p.right == null && q.left == null && q.right == null) {
            return true;
        }
        return internalCheck(p.right, q.left) && internalCheck(p.left, q.right);
    }
}
