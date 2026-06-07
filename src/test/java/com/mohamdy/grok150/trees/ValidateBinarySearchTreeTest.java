package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ValidateBinarySearchTreeTest {
    ValidateBinarySearchTree sol = new ValidateBinarySearchTree();

    @Test void valid() { assertTrue(sol.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3)))); }

    @Test void invalid() {
        assertFalse(sol.isValidBST(new TreeNode(5, new TreeNode(1),
                new TreeNode(4, new TreeNode(3), new TreeNode(6)))));
    }
}
