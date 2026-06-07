package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree sol = new DiameterOfBinaryTree();

    @Test void example() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        assertEquals(3, sol.diameterOfBinaryTree(root));
    }
}
