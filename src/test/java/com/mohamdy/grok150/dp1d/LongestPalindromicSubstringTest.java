package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring sol = new LongestPalindromicSubstring();

    @Test void example() {
        String r = sol.longestPalindrome("babad");
        assertTrue(r.equals("bab") || r.equals("aba"));
    }

    @Test void example2() { assertEquals("bb", sol.longestPalindrome("cbbd")); }
}
