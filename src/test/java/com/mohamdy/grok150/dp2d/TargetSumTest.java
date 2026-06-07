package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TargetSumTest {
    private final TargetSum sol = new TargetSum();

    @Test void example() { assertEquals(5, sol.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3)); }
    @Test void single() { assertEquals(1, sol.findTargetSumWays(new int[]{1}, 1)); }
    @Test void singleNeg() { assertEquals(1, sol.findTargetSumWays(new int[]{1}, -1)); }
    @Test void unreachable() { assertEquals(0, sol.findTargetSumWays(new int[]{1, 2}, 5)); }
    @Test void withZero() { assertEquals(2, sol.findTargetSumWays(new int[]{0, 1}, 1)); }
}
