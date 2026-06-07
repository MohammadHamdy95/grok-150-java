package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingTest {
    // NOTE: the existing solution has a known off-by-one bug; these assert the CORRECT
    // LeetCode answers and are expected to FAIL until the solution is fixed (see REORG_NOTES).
    private final LongestSubstringWithoutRepeating sol = new LongestSubstringWithoutRepeating();

    @Test void example() { assertEquals(3, sol.lengthOfLongestSubstring("abcabcbb")); }
    @Test void allSame() { assertEquals(1, sol.lengthOfLongestSubstring("bbbbb")); }
    @Test void pwwkew() { assertEquals(3, sol.lengthOfLongestSubstring("pwwkew")); }
    @Test void empty() { assertEquals(0, sol.lengthOfLongestSubstring("")); }
    @Test void allUnique() { assertEquals(6, sol.lengthOfLongestSubstring("abcdef")); }
    @Test void withSpace() { assertEquals(3, sol.lengthOfLongestSubstring("a b")); }
}
