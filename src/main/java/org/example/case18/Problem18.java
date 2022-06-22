package org.example.case18;

import org.example.util.TreeNode;

/**
 * https://leetcode.com/problems/same-tree/
 */
public class Problem18 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return internalCheck(p, q);
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
        return internalCheck(p.right, q.right) && internalCheck(p.left, q.left);
    }
}
