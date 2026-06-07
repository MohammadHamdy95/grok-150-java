package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MinimumWindowSubstringTest {
    private final MinimumWindowSubstring sol = new MinimumWindowSubstring();

    @Test void example() { assertEquals("BANC", sol.minWindow("ADOBECODEBANC", "ABC")); }
    @Test void noWindow() { assertEquals("", sol.minWindow("a", "aa")); }
    @Test void single() { assertEquals("a", sol.minWindow("a", "a")); }
    @Test void duplicatesInT() { assertEquals("aa", sol.minWindow("aa", "aa")); }
    @Test void wholeString() { assertEquals("abc", sol.minWindow("abc", "cba")); }
    @Test void emptyT() { assertEquals("", sol.minWindow("abc", "")); }
}
