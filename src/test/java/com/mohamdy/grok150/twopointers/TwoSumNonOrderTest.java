package com.mohamdy.grok150.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class TwoSumNonOrderTest {
    // Existing class: 0-based indices, assumes a SORTED input array (LeetCode "Two Sum II" is 1-based).
    private final TwoSumNonOrder sol = new TwoSumNonOrder();

    @Test void example() { assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{2, 7, 11, 15}, 9)); }
    @Test void twoElements() { assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{1, 3}, 4)); }
    @Test void negativesSorted() { assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{-5, -3, 0, 2, 4}, -8)); }
    @Test void innerPair() { assertArrayEquals(new int[]{3, 4}, sol.twoSum(new int[]{1, 2, 3, 4, 4, 9, 56, 90}, 8)); }
    @Test void noAnswer() { assertNull(sol.twoSum(new int[]{1, 2, 3}, 7)); }
}
