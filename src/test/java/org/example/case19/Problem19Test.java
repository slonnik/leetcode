package org.example.case19;

import org.example.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem19Test {

    @Test
    void testPositive1() {
        var node1 = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        assertTrue(new Problem19().isSymmetric(node1));
    }

    @Test
    void testNegative1() {
        var node1 = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));
        assertFalse(new Problem19().isSymmetric(node1));
    }
}
