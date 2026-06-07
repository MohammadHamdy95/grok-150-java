package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MinCostClimbingStairsTest {
    private final MinCostClimbingStairs sol = new MinCostClimbingStairs();

    @Test void example() { assertEquals(15, sol.minCostClimbingStairs(new int[]{10, 15, 20})); }
    @Test void example2() { assertEquals(6, sol.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})); }
    @Test void two() { assertEquals(0, sol.minCostClimbingStairs(new int[]{0, 0})); }
    @Test void pickCheaperStart() { assertEquals(2, sol.minCostClimbingStairs(new int[]{5, 2, 1})); }
}
