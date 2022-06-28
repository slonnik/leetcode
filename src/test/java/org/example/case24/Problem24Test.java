package org.example.case24;

import org.example.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem24Test {

    @Test
    void testPositive1() {
        var node = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        assertTrue(new Problem24().hasPathSum(node, 22));
    }

    @Test
    void testPositive2() {
        var node = new TreeNode(-2, null, new TreeNode(-3));
        assertTrue(new Problem24().hasPathSum(node, -5));
    }

    @Test
    void testPositive3() {
        var node = new TreeNode(1, new TreeNode(-2), new TreeNode(3));
        assertTrue(new Problem24().hasPathSum(node, -1));
    }

    @Test
    void testNegative1() {
        var node = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertFalse(new Problem24().hasPathSum(node, 5));
    }

    @Test
    void testNegative2() {
        var node = new TreeNode(1, new TreeNode(2), null);
        assertFalse(new Problem24().hasPathSum(node, 1));
    }
}
