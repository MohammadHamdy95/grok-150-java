package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class RegularExpressionMatchingTest {
    RegularExpressionMatching sol = new RegularExpressionMatching();

    @Test void noMatch() { assertFalse(sol.isMatch("aa", "a")); }
    @Test void star() { assertTrue(sol.isMatch("aa", "a*")); }
    @Test void dotStar() { assertTrue(sol.isMatch("ab", ".*")); }
}
