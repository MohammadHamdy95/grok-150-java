package com.mohamdy.blind75.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CombinationSumIITest {
    CombinationSumII sol = new CombinationSumII();

    @Test void example() {
        // expected: [1,1,6],[1,2,5],[1,7],[2,6]
        assertEquals(4, sol.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8).size());
    }
}
