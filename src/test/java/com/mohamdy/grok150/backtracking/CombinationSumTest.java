package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CombinationSumTest {
    CombinationSum sol = new CombinationSum();

    @Test void example() {
        // expected: [[2, 2, 3], [7]]
        assertEquals(2, sol.combinationSum(new int[]{2, 3, 6, 7}, 7).size());
    }

    @Test void none() { assertEquals(0, sol.combinationSum(new int[]{2}, 1).size()); }
}
