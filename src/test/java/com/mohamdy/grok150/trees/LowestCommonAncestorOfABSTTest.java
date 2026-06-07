package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LowestCommonAncestorOfABSTTest {
    LowestCommonAncestorOfABST sol = new LowestCommonAncestorOfABST();

    @Test void example() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4)),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        assertEquals(6, sol.lowestCommonAncestor(root, root.left, root.right).val);
        assertEquals(2, sol.lowestCommonAncestor(root, root.left, root.left.right).val);
    }
}
