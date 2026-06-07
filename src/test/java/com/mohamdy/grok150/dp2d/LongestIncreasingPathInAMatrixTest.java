package com.mohamdy.grok150.dp2d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LongestIncreasingPathInAMatrixTest {
    private final LongestIncreasingPathInAMatrix sol = new LongestIncreasingPathInAMatrix();

    @Test void example() { assertEquals(4, sol.longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}})); }
    @Test void example2() { assertEquals(4, sol.longestIncreasingPath(new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}})); }
    @Test void single() { assertEquals(1, sol.longestIncreasingPath(new int[][]{{1}})); }
    @Test void allEqual() { assertEquals(1, sol.longestIncreasingPath(new int[][]{{7, 7}, {7, 7}})); }
}
