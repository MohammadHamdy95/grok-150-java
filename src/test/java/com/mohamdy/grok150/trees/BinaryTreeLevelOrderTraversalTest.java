package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class BinaryTreeLevelOrderTraversalTest {
    private final BinaryTreeLevelOrderTraversal sol = new BinaryTreeLevelOrderTraversal();

    @Test void example() {
        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)),
                sol.levelOrder(Trees.build(3, 9, 20, null, null, 15, 7)));
    }
    @Test void empty() { assertEquals(List.of(), sol.levelOrder(null)); }
    @Test void single() { assertEquals(List.of(List.of(1)), sol.levelOrder(Trees.build(1))); }
    @Test void leftSkewed() { assertEquals(List.of(List.of(1), List.of(2), List.of(3)), sol.levelOrder(Trees.build(1, 2, null, 3))); }
}
