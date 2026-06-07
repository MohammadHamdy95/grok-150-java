package com.mohamdy.blind75.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PalindromicSubstringsTest {
    PalindromicSubstrings sol = new PalindromicSubstrings();

    @Test void example() { assertEquals(3, sol.countSubstrings("abc")); }
    @Test void example2() { assertEquals(6, sol.countSubstrings("aaa")); }
}
