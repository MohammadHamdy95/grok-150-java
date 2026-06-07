package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence sol = new LongestIncreasingSubsequence();

    @Test void example() { assertEquals(4, sol.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18})); }
    @Test void allSame() { assertEquals(1, sol.lengthOfLIS(new int[]{7, 7, 7})); }
}
