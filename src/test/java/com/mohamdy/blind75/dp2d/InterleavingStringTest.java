package com.mohamdy.blind75.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class InterleavingStringTest {
    InterleavingString sol = new InterleavingString();

    @Test void interleaves() { assertTrue(sol.isInterleave("aabcc", "dbbca", "aadbbcbcac")); }
    @Test void doesNotInterleave() { assertFalse(sol.isInterleave("aabcc", "dbbca", "aadbbbaccc")); }
}
