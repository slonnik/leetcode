package org.example.case30;


import org.example.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class Problem30 {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> data = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        if(root == null) {
            return List.of();
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            var node = stack.pollLast();
            data.add(node.val);
            if (node.right != null) {
                stack.add(node.right);

            }
            if (node.left != null) {
                stack.add(node.left);

            }
        }
        return data;
    }

    private void internalTraversal(List<Integer> data, TreeNode node) {
        if (node == null) {
            return;
        }
        data.add(node.val);
        internalTraversal(data, node.left);
        internalTraversal(data, node.right);

    }

}
