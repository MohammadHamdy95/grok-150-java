package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NumberOfConnectedComponentsInAnUndirectedGraphTest {
    private final NumberOfConnectedComponentsInAnUndirectedGraph sol = new NumberOfConnectedComponentsInAnUndirectedGraph();

    @Test void two() { assertEquals(2, sol.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}})); }
    @Test void one() { assertEquals(1, sol.countComponents(4, new int[][]{{0, 1}, {2, 3}, {1, 2}})); }
    @Test void noEdges() { assertEquals(5, sol.countComponents(5, new int[][]{})); }
    @Test void allConnected() { assertEquals(1, sol.countComponents(3, new int[][]{{0, 1}, {1, 2}})); }
}
