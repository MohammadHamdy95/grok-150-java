package com.mohamdy.blind75.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class GraphValidTreeTest {
    GraphValidTree sol = new GraphValidTree();

    @Test void valid() { assertTrue(sol.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}})); }
    @Test void hasCycle() { assertFalse(sol.validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}})); }
}
