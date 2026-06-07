package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class InvertBinaryTreeTest {
    InvertBinaryTree sol = new InvertBinaryTree();

    @Test void example() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode r = sol.invertTree(root);
        assertEquals(4, r.val);
        assertEquals(7, r.left.val);
        assertEquals(2, r.right.val);
    }

    @Test void empty() { assertNull(sol.invertTree(null)); }
}
