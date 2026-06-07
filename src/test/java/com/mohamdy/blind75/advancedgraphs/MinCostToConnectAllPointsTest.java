package com.mohamdy.blind75.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MinCostToConnectAllPointsTest {
    MinCostToConnectAllPoints sol = new MinCostToConnectAllPoints();

    @Test void example() { assertEquals(20, sol.minCostConnectPoints(new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}})); }
    @Test void two() { assertEquals(18, sol.minCostConnectPoints(new int[][]{{3,12},{-2,5},{-4,1}})); }
}
