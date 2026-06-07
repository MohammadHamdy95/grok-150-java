package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    private final ConstructBinaryTreeFromPreorderAndInorderTraversal sol = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test void example() {
        TreeNode r = sol.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertEquals(3, r.val);
        assertEquals(9, r.left.val);
        assertEquals(20, r.right.val);
        assertEquals(15, r.right.left.val);
        assertEquals(7, r.right.right.val);
    }
    @Test void single() {
        TreeNode r = sol.buildTree(new int[]{1}, new int[]{1});
        assertEquals(1, r.val);
        assertNull(r.left);
        assertNull(r.right);
    }
    @Test void leftChain() {
        TreeNode r = sol.buildTree(new int[]{3, 2, 1}, new int[]{1, 2, 3});
        assertEquals(3, r.val);
        assertEquals(2, r.left.val);
        assertEquals(1, r.left.left.val);
    }
}
