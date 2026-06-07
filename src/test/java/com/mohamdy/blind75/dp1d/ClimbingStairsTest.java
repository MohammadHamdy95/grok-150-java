package com.mohamdy.blind75.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ClimbingStairsTest {
    ClimbingStairs sol = new ClimbingStairs();

    @Test void three() { assertEquals(3, sol.climbStairs(3)); }
    @Test void five() { assertEquals(8, sol.climbStairs(5)); }
    @Test void one() { assertEquals(1, sol.climbStairs(1)); }
}
