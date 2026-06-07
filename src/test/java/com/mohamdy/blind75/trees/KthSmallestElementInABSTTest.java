package com.mohamdy.blind75.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class KthSmallestElementInABSTTest {
    KthSmallestElementInABST sol = new KthSmallestElementInABST();

    @Test void example() {
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        assertEquals(1, sol.kthSmallest(root, 1));
        assertEquals(3, sol.kthSmallest(root, 3));
    }
}
