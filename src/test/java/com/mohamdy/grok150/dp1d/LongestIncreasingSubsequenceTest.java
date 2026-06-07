package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LongestIncreasingSubsequenceTest {
    private final LongestIncreasingSubsequence sol = new LongestIncreasingSubsequence();

    @Test void example() { assertEquals(4, sol.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18})); }
    @Test void allSame() { assertEquals(1, sol.lengthOfLIS(new int[]{7, 7, 7})); }
    @Test void increasing() { assertEquals(5, sol.lengthOfLIS(new int[]{1, 2, 3, 4, 5})); }
    @Test void decreasing() { assertEquals(1, sol.lengthOfLIS(new int[]{5, 4, 3, 2, 1})); }
    @Test void single() { assertEquals(1, sol.lengthOfLIS(new int[]{10})); }
    @Test void withDuplicates() { assertEquals(4, sol.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3})); }
}
