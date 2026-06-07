package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MaximumDepthOfBinaryTreeTest {
    private final MaximumDepthOfBinaryTree sol = new MaximumDepthOfBinaryTree();

    @Test void example() { assertEquals(3, sol.maxDepth(Trees.build(3, 9, 20, null, null, 15, 7))); }
    @Test void empty() { assertEquals(0, sol.maxDepth(null)); }
    @Test void single() { assertEquals(1, sol.maxDepth(Trees.build(1))); }
    @Test void leftSkewed() { assertEquals(3, sol.maxDepth(Trees.build(1, 2, null, 3))); }
}
