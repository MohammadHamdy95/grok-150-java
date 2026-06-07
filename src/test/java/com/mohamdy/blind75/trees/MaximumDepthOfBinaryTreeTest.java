package com.mohamdy.blind75.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MaximumDepthOfBinaryTreeTest {
    MaximumDepthOfBinaryTree sol = new MaximumDepthOfBinaryTree();

    @Test void example() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(3, sol.maxDepth(root));
    }

    @Test void empty() { assertEquals(0, sol.maxDepth(null)); }
}
