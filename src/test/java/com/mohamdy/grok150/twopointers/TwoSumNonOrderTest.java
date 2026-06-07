package com.mohamdy.grok150.twopointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumNonOrderTest {
    // NOTE: returns 0-based indices and assumes a sorted input array (LeetCode "Two Sum II"
    // returns 1-based indices). Tests assert this class's actual 0-based behavior.
    TwoSumNonOrder sol = new TwoSumNonOrder();

    @Test void example() { assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{2, 7, 11, 15}, 9)); }
    @Test void twoElements() { assertArrayEquals(new int[]{0, 1}, sol.twoSum(new int[]{1, 3}, 4)); }
    @Test void noAnswer() { assertNull(sol.twoSum(new int[]{1, 2, 3}, 100)); }
}
