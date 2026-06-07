package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LongestCommonSubsequenceTest {
    private final LongestCommonSubsequence sol = new LongestCommonSubsequence();

    @Test void example() { assertEquals(3, sol.longestCommonSubsequence("abcde", "ace")); }
    @Test void identical() { assertEquals(3, sol.longestCommonSubsequence("abc", "abc")); }
    @Test void none() { assertEquals(0, sol.longestCommonSubsequence("abc", "def")); }
    @Test void empty() { assertEquals(0, sol.longestCommonSubsequence("", "abc")); }
    @Test void subsequenceWithGaps() { assertEquals(3, sol.longestCommonSubsequence("aXbXc", "abc")); }
}
