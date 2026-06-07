package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MergeIntervalsTest {
    private final MergeIntervals sol = new MergeIntervals();

    @Test void example() { assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, sol.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})); }
    @Test void touching() { assertArrayEquals(new int[][]{{1, 5}}, sol.merge(new int[][]{{1, 4}, {4, 5}})); }
    @Test void single() { assertArrayEquals(new int[][]{{1, 4}}, sol.merge(new int[][]{{1, 4}})); }
    @Test void unsortedInput() { assertArrayEquals(new int[][]{{1, 4}}, sol.merge(new int[][]{{1, 4}, {2, 3}})); }
    @Test void noOverlap() { assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, sol.merge(new int[][]{{1, 2}, {3, 4}})); }
}
