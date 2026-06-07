package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ClimbingStairsTest {
    private final ClimbingStairs sol = new ClimbingStairs();

    @Test void one() { assertEquals(1, sol.climbStairs(1)); }
    @Test void two() { assertEquals(2, sol.climbStairs(2)); }
    @Test void three() { assertEquals(3, sol.climbStairs(3)); }
    @Test void five() { assertEquals(8, sol.climbStairs(5)); }
    @Test void ten() { assertEquals(89, sol.climbStairs(10)); }
}
