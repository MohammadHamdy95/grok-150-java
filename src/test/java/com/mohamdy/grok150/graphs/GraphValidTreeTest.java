package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class GraphValidTreeTest {
    private final GraphValidTree sol = new GraphValidTree();

    @Test void valid() { assertTrue(sol.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}})); }
    @Test void hasCycle() { assertFalse(sol.validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}})); }
    @Test void disconnected() { assertFalse(sol.validTree(4, new int[][]{{0, 1}, {2, 3}})); }
    @Test void singleNode() { assertTrue(sol.validTree(1, new int[][]{})); }
    @Test void twoNodesOneEdge() { assertTrue(sol.validTree(2, new int[][]{{0, 1}})); }
}
