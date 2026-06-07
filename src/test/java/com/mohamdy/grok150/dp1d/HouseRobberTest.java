package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class HouseRobberTest {
    private final HouseRobber sol = new HouseRobber();

    @Test void example() { assertEquals(4, sol.rob(new int[]{1, 2, 3, 1})); }
    @Test void example2() { assertEquals(12, sol.rob(new int[]{2, 7, 9, 3, 1})); }
    @Test void single() { assertEquals(5, sol.rob(new int[]{5})); }
    @Test void two() { assertEquals(2, sol.rob(new int[]{1, 2})); }
    @Test void allEqual() { assertEquals(6, sol.rob(new int[]{3, 3, 3, 3})); }
}
