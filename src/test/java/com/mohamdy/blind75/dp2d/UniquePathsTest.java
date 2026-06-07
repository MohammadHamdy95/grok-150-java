package com.mohamdy.blind75.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class UniquePathsTest {
    UniquePaths sol = new UniquePaths();

    @Test void example() { assertEquals(28, sol.uniquePaths(3, 7)); }
    @Test void example2() { assertEquals(3, sol.uniquePaths(3, 2)); }
}
