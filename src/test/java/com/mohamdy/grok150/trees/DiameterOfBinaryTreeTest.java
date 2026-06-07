package com.mohamdy.grok150.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import com.mohamdy.grok150.support.Trees;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class DiameterOfBinaryTreeTest {
    private final DiameterOfBinaryTree sol = new DiameterOfBinaryTree();

    @Test void example() { assertEquals(3, sol.diameterOfBinaryTree(Trees.build(1, 2, 3, 4, 5))); }
    @Test void single() { assertEquals(0, sol.diameterOfBinaryTree(Trees.build(1))); }
    @Test void twoNodes() { assertEquals(1, sol.diameterOfBinaryTree(Trees.build(1, 2))); }
    @Test void throughRoot() { assertEquals(4, sol.diameterOfBinaryTree(Trees.build(1, 2, 3, 4, 5, null, 6))); }
}
