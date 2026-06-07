package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class InterleavingStringTest {
    private final InterleavingString sol = new InterleavingString();

    @Test void interleaves() { assertTrue(sol.isInterleave("aabcc", "dbbca", "aadbbcbcac")); }
    @Test void doesNot() { assertFalse(sol.isInterleave("aabcc", "dbbca", "aadbbbaccc")); }
    @Test void bothEmpty() { assertTrue(sol.isInterleave("", "", "")); }
    @Test void lengthMismatch() { assertFalse(sol.isInterleave("a", "b", "a")); }
    @Test void oneEmpty() { assertTrue(sol.isInterleave("", "abc", "abc")); }
}
