package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PalindromicSubstringsTest {
    private final PalindromicSubstrings sol = new PalindromicSubstrings();

    @Test void example() { assertEquals(3, sol.countSubstrings("abc")); }
    @Test void allSame() { assertEquals(6, sol.countSubstrings("aaa")); }
    @Test void single() { assertEquals(1, sol.countSubstrings("a")); }
    @Test void mixed() { assertEquals(7, sol.countSubstrings("aaba")); }
}
