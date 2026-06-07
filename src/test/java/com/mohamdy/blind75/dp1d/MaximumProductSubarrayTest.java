package com.mohamdy.blind75.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MaximumProductSubarrayTest {
    MaximumProductSubarray sol = new MaximumProductSubarray();

    @Test void example() { assertEquals(6, sol.maxProduct(new int[]{2, 3, -2, 4})); }
    @Test void example2() { assertEquals(0, sol.maxProduct(new int[]{-2, 0, -1})); }
}
