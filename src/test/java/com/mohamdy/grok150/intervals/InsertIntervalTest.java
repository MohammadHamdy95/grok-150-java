package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class InsertIntervalTest {
    InsertInterval sol = new InsertInterval();

    @Test void noOverlap() {
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, sol.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
    }

    @Test void merge() {
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}},
                sol.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}));
    }
}
