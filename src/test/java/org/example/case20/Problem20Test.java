package org.example.case20;

import org.example.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem20Test {

    @Test
    void testPositive1() {
        assertEquals(3, new Problem20().maxDepth(new TreeNode(3,
                new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    @Test
    void testPositive2() {
        assertEquals(2, new Problem20().maxDepth(new TreeNode(1, null, new TreeNode(2))));
    }
}
