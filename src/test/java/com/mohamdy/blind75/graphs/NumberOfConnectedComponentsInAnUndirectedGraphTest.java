package com.mohamdy.blind75.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NumberOfConnectedComponentsInAnUndirectedGraphTest {
    NumberOfConnectedComponentsInAnUndirectedGraph sol = new NumberOfConnectedComponentsInAnUndirectedGraph();

    @Test void example() { assertEquals(2, sol.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}})); }
    @Test void oneComponent() { assertEquals(1, sol.countComponents(4, new int[][]{{0, 1}, {2, 3}, {1, 2}})); }
}
