package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class InsertIntervalTest {
    private final InsertInterval sol = new InsertInterval();

    @Test void noOverlap() { assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, sol.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})); }
    @Test void mergeSpan() { assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, sol.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8})); }
    @Test void intoEmpty() { assertArrayEquals(new int[][]{{5, 7}}, sol.insert(new int[][]{}, new int[]{5, 7})); }
    @Test void prepend() { assertArrayEquals(new int[][]{{1, 2}, {3, 5}, {6, 8}}, sol.insert(new int[][]{{3, 5}, {6, 8}}, new int[]{1, 2})); }
    @Test void append() { assertArrayEquals(new int[][]{{1, 2}, {3, 5}, {6, 8}}, sol.insert(new int[][]{{1, 2}, {3, 5}}, new int[]{6, 8})); }
}
