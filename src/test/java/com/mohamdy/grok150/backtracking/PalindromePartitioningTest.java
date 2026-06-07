package com.mohamdy.grok150.backtracking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PalindromePartitioningTest {
    PalindromePartitioning sol = new PalindromePartitioning();

    @Test void example() {
        // expected: [a,a,b],[aa,b]
        assertEquals(2, sol.partition("aab").size());
    }
}
