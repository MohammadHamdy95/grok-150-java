package com.mohamdy.blind75.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BinaryTreeLevelOrderTraversalTest {
    BinaryTreeLevelOrderTraversal sol = new BinaryTreeLevelOrderTraversal();

    @Test void example() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), sol.levelOrder(root));
    }

    @Test void empty() { assertEquals(List.of(), sol.levelOrder(null)); }
}
