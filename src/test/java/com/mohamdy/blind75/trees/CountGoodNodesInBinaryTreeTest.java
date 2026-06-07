package com.mohamdy.blind75.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CountGoodNodesInBinaryTreeTest {
    CountGoodNodesInBinaryTree sol = new CountGoodNodesInBinaryTree();

    @Test void example() {
        TreeNode root = new TreeNode(3,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5)));
        assertEquals(4, sol.goodNodes(root));
    }
}
