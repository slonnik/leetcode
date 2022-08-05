package org.example.case30;

import org.example.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem30Test {

    @Test
    void testPositive1() {

        var treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertEquals(List.of(1, 2, 3), new Problem30().preorderTraversal(treeNode));
    }

    @Test
    void testPositive2() {

        var treeNode = new TreeNode(1, new TreeNode(4, new TreeNode(2), null), new TreeNode(3));
        assertEquals(List.of(1,4,2,3), new Problem30().preorderTraversal(treeNode));
    }
}
