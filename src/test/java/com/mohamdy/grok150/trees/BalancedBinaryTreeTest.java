package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BalancedBinaryTreeTest {
    private final BalancedBinaryTree sol = new BalancedBinaryTree();

    @Test void balanced() { assertTrue(sol.isBalanced(Trees.build(3, 9, 20, null, null, 15, 7))); }
    @Test void notBalanced() { assertFalse(sol.isBalanced(Trees.build(1, 2, 2, 3, 3, null, null, 4, 4))); }
    @Test void empty() { assertTrue(sol.isBalanced(null)); }
    @Test void single() { assertTrue(sol.isBalanced(Trees.build(1))); }
}
