package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TargetSumTest {
    TargetSum sol = new TargetSum();

    @Test void example() { assertEquals(5, sol.findTargetSumWays(new int[]{1,1,1,1,1}, 3)); }
    @Test void single() { assertEquals(1, sol.findTargetSumWays(new int[]{1}, 1)); }
}
