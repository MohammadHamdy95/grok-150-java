package com.mohamdy.blind75.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    ConstructBinaryTreeFromPreorderAndInorderTraversal sol = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test void example() {
        TreeNode r = sol.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertEquals(3, r.val);
        assertEquals(9, r.left.val);
        assertEquals(20, r.right.val);
        assertEquals(15, r.right.left.val);
    }
}
