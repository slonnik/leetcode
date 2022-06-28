package org.example.case21;

import org.example.util.TreeNode;
import org.example.util.TreeNodes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem21Test {

    @Test
    void testPositive1() {
       var node = new Problem21().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
       assertTrue(TreeNodes.isSameTree(new TreeNode(0,
               new TreeNode(-3, new TreeNode(-10), null),
               new TreeNode(9,  new TreeNode(5), null)), node));
    }

    @Test
    void testPositive2() {
        var node = new Problem21().sortedArrayToBST(new int[]{1,3});
        assertTrue(TreeNodes.isSameTree(new TreeNode(3, new TreeNode(1), null), node));
    }
}
