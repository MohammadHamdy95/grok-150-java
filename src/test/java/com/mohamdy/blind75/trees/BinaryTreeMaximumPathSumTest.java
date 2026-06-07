package com.mohamdy.blind75.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BinaryTreeMaximumPathSumTest {
    BinaryTreeMaximumPathSum sol = new BinaryTreeMaximumPathSum();

    @Test void example() { assertEquals(6, sol.maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)))); }

    @Test void withNegativeRoot() {
        assertEquals(42, sol.maxPathSum(new TreeNode(-10, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }
}
