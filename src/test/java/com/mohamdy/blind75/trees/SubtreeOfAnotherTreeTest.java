package com.mohamdy.blind75.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SubtreeOfAnotherTreeTest {
    SubtreeOfAnotherTree sol = new SubtreeOfAnotherTree();

    @Test void isSub() {
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode sub = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        assertTrue(sol.isSubtree(root, sub));
    }

    @Test void notSub() {
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode sub = new TreeNode(4, new TreeNode(1), new TreeNode(3));
        assertFalse(sol.isSubtree(root, sub));
    }
}
