package com.mohamdy.grok150.dp1d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class DecodeWaysTest {
    DecodeWays sol = new DecodeWays();

    @Test void example() { assertEquals(2, sol.numDecodings("12")); }
    @Test void example2() { assertEquals(3, sol.numDecodings("226")); }
    @Test void leadingZero() { assertEquals(0, sol.numDecodings("06")); }
}
