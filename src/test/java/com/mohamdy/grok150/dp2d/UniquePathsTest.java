package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class UniquePathsTest {
    private final UniquePaths sol = new UniquePaths();

    @Test void example() { assertEquals(28, sol.uniquePaths(3, 7)); }
    @Test void example2() { assertEquals(3, sol.uniquePaths(3, 2)); }
    @Test void singleRow() { assertEquals(1, sol.uniquePaths(1, 5)); }
    @Test void singleCell() { assertEquals(1, sol.uniquePaths(1, 1)); }
    @Test void square() { assertEquals(6, sol.uniquePaths(3, 3)); }
}
