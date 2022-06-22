package org.example.case18;


import org.example.util.TreeNode;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem18Test {

    @Test
    public void testPositive1() {
        var node1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        var node2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(new Problem18().isSameTree(node1, node2));
    }

    @Test
    public void testNegative1() {
        var node1 = new TreeNode(1, new TreeNode(2), null);
        var node2 = new TreeNode(1, null, new TreeNode(2));
        assertFalse(new Problem18().isSameTree(node1, node2));
    }

    @Test
    public void testNegative2() {
        var node1 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        var node2 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        assertFalse(new Problem18().isSameTree(node1, node2));
    }
}
