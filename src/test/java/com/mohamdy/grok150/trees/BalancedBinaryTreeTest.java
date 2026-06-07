package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BalancedBinaryTreeTest {
    BalancedBinaryTree sol = new BalancedBinaryTree();

    @Test void balanced() {
        assertTrue(sol.isBalanced(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    @Test void notBalanced() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), null);
        assertFalse(sol.isBalanced(root));
    }
}
