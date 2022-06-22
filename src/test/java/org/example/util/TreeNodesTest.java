package org.example.util;

import org.junit.jupiter.api.Test;

public class TreeNodesTest {

    @Test
    void testPositive1() {
        var node = TreeNodes.from(1, 2, 3, 4, 5, 6, 7);
        var list = TreeNodes.to(node);
    }

    @Test
    void testPositive2() {
        var node = TreeNodes.from(1, 2, 3, 4, 5, 6);
        var list = TreeNodes.to(node);
    }

    @Test
    void testPositive4() {
        var node = TreeNodes.from(1, 2, Integer.MIN_VALUE, 4, 5);
        var list = TreeNodes.to(node);
    }

    @Test
    void testPositive5() {
        var node = TreeNodes.from(1, Integer.MIN_VALUE, 3, Integer.MIN_VALUE, Integer.MIN_VALUE, 4, 5);
        var list = TreeNodes.to(node);
    }
}
