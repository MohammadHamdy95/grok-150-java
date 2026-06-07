package com.mohamdy.blind75.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class DistinctSubsequencesTest {
    DistinctSubsequences sol = new DistinctSubsequences();

    @Test void example() { assertEquals(3, sol.numDistinct("rabbbit", "rabbit")); }
    @Test void example2() { assertEquals(5, sol.numDistinct("babgbag", "bag")); }
}
