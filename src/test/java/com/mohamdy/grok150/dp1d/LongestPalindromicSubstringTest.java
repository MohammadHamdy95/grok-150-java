package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LongestPalindromicSubstringTest {
    private final LongestPalindromicSubstring sol = new LongestPalindromicSubstring();

    @Test void example() { String r = sol.longestPalindrome("babad"); assertTrue(r.equals("bab") || r.equals("aba")); }
    @Test void evenLength() { assertEquals("bb", sol.longestPalindrome("cbbd")); }
    @Test void single() { assertEquals("a", sol.longestPalindrome("a")); }
    @Test void wholeString() { assertEquals("racecar", sol.longestPalindrome("racecar")); }
    @Test void noRepeat() { assertEquals(1, sol.longestPalindrome("abcd").length()); }
}
