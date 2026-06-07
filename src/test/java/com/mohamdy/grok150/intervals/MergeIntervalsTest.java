package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MergeIntervalsTest {
    MergeIntervals sol = new MergeIntervals();

    @Test void example() {
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                sol.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    @Test void touching() {
        assertArrayEquals(new int[][]{{1, 5}}, sol.merge(new int[][]{{1, 4}, {4, 5}}));
    }
}
