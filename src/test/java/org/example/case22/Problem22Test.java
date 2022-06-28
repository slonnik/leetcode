package org.example.case22;

import org.example.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem22Test {

    @Test
    void testPositive1() {
        var node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertTrue(new Problem22().isBalanced(node));
    }

    @Test
    void testNegative1() {
        var node = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        assertFalse(new Problem22().isBalanced(node));
    }
}
