package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class SubsetsIITest {
    SubsetsII sol = new SubsetsII();

    @Test void example() {
        // expected unique subsets: [],[1],[2],[1,2],[2,2],[1,2,2]
        assertEquals(6, sol.subsetsWithDup(new int[]{1,2,2}).size());
    }
}
