package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MaximumProductSubarrayTest {
    private final MaximumProductSubarray sol = new MaximumProductSubarray();

    @Test void example() { assertEquals(6, sol.maxProduct(new int[]{2, 3, -2, 4})); }
    @Test void zeroResets() { assertEquals(0, sol.maxProduct(new int[]{-2, 0, -1})); }
    @Test void twoNegatives() { assertEquals(24, sol.maxProduct(new int[]{-2, 3, -4})); }
    @Test void single() { assertEquals(-2, sol.maxProduct(new int[]{-2})); }
    @Test void allNegativesEvenCount() { assertEquals(24, sol.maxProduct(new int[]{-1, -2, -3, -4})); }
}
