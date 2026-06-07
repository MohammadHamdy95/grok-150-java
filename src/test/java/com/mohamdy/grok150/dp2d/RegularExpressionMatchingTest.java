package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class RegularExpressionMatchingTest {
    private final RegularExpressionMatching sol = new RegularExpressionMatching();

    @Test void literalMismatch() { assertFalse(sol.isMatch("aa", "a")); }
    @Test void star() { assertTrue(sol.isMatch("aa", "a*")); }
    @Test void dotStar() { assertTrue(sol.isMatch("ab", ".*")); }
    @Test void starGroups() { assertTrue(sol.isMatch("aab", "c*a*b")); }
    @Test void noMatch() { assertFalse(sol.isMatch("mississippi", "mis*is*p*.")); }
    @Test void emptyWithStar() { assertTrue(sol.isMatch("", "a*")); }
}
