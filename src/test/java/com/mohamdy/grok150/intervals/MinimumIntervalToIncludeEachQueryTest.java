package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MinimumIntervalToIncludeEachQueryTest {
    private final MinimumIntervalToIncludeEachQuery sol = new MinimumIntervalToIncludeEachQuery();

    @Test void example() { assertArrayEquals(new int[]{3, 3, 1, 4}, sol.minInterval(new int[][]{{1, 4}, {2, 4}, {3, 6}, {4, 4}}, new int[]{2, 3, 4, 5})); }
    @Test void example2() { assertArrayEquals(new int[]{2, -1, 4, 6}, sol.minInterval(new int[][]{{2, 3}, {2, 5}, {1, 8}, {20, 25}}, new int[]{2, 19, 5, 22})); }
    @Test void noneContains() { assertArrayEquals(new int[]{-1}, sol.minInterval(new int[][]{{1, 2}}, new int[]{5})); }
    @Test void singleContains() { assertArrayEquals(new int[]{5}, sol.minInterval(new int[][]{{1, 5}}, new int[]{3})); }
}
