package com.mohamdy.grok150.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    MaximumSubarray sol = new MaximumSubarray();

    @Test void exampleTwo() { assertEquals(23, sol.maxSubArray(new int[]{5,4,-1,7,8})); }
    @Test void exampleThree() { assertEquals(6, sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); }
    @Test void example() { assertEquals(6, sol.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); }
    @Test void single() { assertEquals(1, sol.maxSubArray(new int[]{1})); }
    @Test void allNegative() { assertEquals(-1, sol.maxSubArray(new int[]{-3, -1, -2})); }
}
