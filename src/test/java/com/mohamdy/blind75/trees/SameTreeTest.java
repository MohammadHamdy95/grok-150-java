package com.mohamdy.blind75.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SameTreeTest {
    SameTree sol = new SameTree();

    @Test void same() {
        assertTrue(sol.isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }

    @Test void different() {
        assertFalse(sol.isSameTree(new TreeNode(1, new TreeNode(2), null),
                new TreeNode(1, null, new TreeNode(2))));
    }
}
