package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MaximumSubarrayTest {
    private final MaximumSubarray sol = new MaximumSubarray();

    @Test void example() { assertEquals(6, sol.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); }
    @Test void single() { assertEquals(1, sol.maxSubArray(new int[]{1})); }
    @Test void allNegative() { assertEquals(-1, sol.maxSubArray(new int[]{-3, -1, -2})); }
    @Test void allPositive() { assertEquals(10, sol.maxSubArray(new int[]{1, 2, 3, 4})); }
    @Test void singleNegative() { assertEquals(-5, sol.maxSubArray(new int[]{-5})); }
}
