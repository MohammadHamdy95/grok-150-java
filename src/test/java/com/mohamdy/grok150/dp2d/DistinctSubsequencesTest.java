package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class DistinctSubsequencesTest {
    private final DistinctSubsequences sol = new DistinctSubsequences();

    @Test void example() { assertEquals(3, sol.numDistinct("rabbbit", "rabbit")); }
    @Test void example2() { assertEquals(5, sol.numDistinct("babgbag", "bag")); }
    @Test void emptyTarget() { assertEquals(1, sol.numDistinct("abc", "")); }
    @Test void targetLonger() { assertEquals(0, sol.numDistinct("a", "aa")); }
    @Test void identical() { assertEquals(1, sol.numDistinct("abc", "abc")); }
}
