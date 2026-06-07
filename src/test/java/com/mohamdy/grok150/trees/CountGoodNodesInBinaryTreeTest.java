package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CountGoodNodesInBinaryTreeTest {
    private final CountGoodNodesInBinaryTree sol = new CountGoodNodesInBinaryTree();

    @Test void example() { assertEquals(4, sol.goodNodes(Trees.build(3, 1, 4, 3, null, 1, 5))); }
    @Test void allGood() { assertEquals(3, sol.goodNodes(Trees.build(1, 1, 1))); }
    @Test void single() { assertEquals(1, sol.goodNodes(Trees.build(5))); }
    @Test void onlyRootGood() { assertEquals(1, sol.goodNodes(Trees.build(5, 4, 3))); }
}
