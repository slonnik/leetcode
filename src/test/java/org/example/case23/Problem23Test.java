package org.example.case23;

import org.example.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem23Test {

    @Test
    void testPositive1() {
       var node =  new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
       assertEquals(2, new Problem23().minDepth(node));
    }

    @Test
    void testPositive2() {
        var node =  new TreeNode(2, new TreeNode(3, new TreeNode(4, new TreeNode(5,new TreeNode(6), null), null), null), null);
        assertEquals(5, new Problem23().minDepth(node));
    }
}
