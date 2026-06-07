package com.mohamdy.grok150.slidingwindow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingTest {
    LongestSubstringWithoutRepeating sol = new LongestSubstringWithoutRepeating();

    @Test void example() { assertEquals(3, sol.lengthOfLongestSubstring("abcabcbb")); }
    @Test void allSame() { assertEquals(1, sol.lengthOfLongestSubstring("bbbbb")); }
    @Test void pwwkew() { assertEquals(3, sol.lengthOfLongestSubstring("pwwkew")); }
    @Test void empty() { assertEquals(0, sol.lengthOfLongestSubstring("")); }
}
