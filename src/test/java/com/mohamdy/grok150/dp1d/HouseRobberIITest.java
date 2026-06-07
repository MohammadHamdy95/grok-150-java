package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class HouseRobberIITest {
    private final HouseRobberII sol = new HouseRobberII();

    @Test void example() { assertEquals(3, sol.rob(new int[]{2, 3, 2})); }
    @Test void example2() { assertEquals(4, sol.rob(new int[]{1, 2, 3, 1})); }
    @Test void single() { assertEquals(5, sol.rob(new int[]{5})); }
    @Test void two() { assertEquals(3, sol.rob(new int[]{3, 2})); }
    @Test void five() { assertEquals(340, sol.rob(new int[]{200, 3, 140, 20, 10})); }
}
