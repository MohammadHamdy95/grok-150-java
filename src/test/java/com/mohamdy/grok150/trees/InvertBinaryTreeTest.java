package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class InvertBinaryTreeTest {
    private final InvertBinaryTree sol = new InvertBinaryTree();

    @Test void example() {
        TreeNode r = sol.invertTree(Trees.build(4, 2, 7, 1, 3, 6, 9));
        assertEquals(4, r.val);
        assertEquals(7, r.left.val);
        assertEquals(2, r.right.val);
        assertEquals(9, r.left.left.val);
        assertEquals(1, r.right.right.val);
    }
    @Test void empty() { assertNull(sol.invertTree(null)); }
    @Test void single() { assertEquals(1, sol.invertTree(Trees.build(1)).val); }
}
