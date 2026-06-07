package com.mohamdy.grok150.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MinCostToConnectAllPointsTest {
    private final MinCostToConnectAllPoints sol = new MinCostToConnectAllPoints();

    @Test void example() { assertEquals(20, sol.minCostConnectPoints(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}})); }
    @Test void example2() { assertEquals(18, sol.minCostConnectPoints(new int[][]{{3, 12}, {-2, 5}, {-4, 1}})); }
    @Test void single() { assertEquals(0, sol.minCostConnectPoints(new int[][]{{0, 0}})); }
    @Test void two() { assertEquals(4, sol.minCostConnectPoints(new int[][]{{0, 0}, {2, 2}})); }
}
