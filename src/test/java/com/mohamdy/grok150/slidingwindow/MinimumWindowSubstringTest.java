package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MinimumWindowSubstringTest {
    MinimumWindowSubstring sol = new MinimumWindowSubstring();

    @Test void example() { assertEquals("BANC", sol.minWindow("ADOBECODEBANC", "ABC")); }
    @Test void noWindow() { assertEquals("", sol.minWindow("a", "aa")); }
    @Test void single() { assertEquals("a", sol.minWindow("a", "a")); }
}
