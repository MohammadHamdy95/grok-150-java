package com.mohamdy.blind75.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NonOverlappingIntervalsTest {
    NonOverlappingIntervals sol = new NonOverlappingIntervals();

    @Test void example() { assertEquals(1, sol.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}})); }
    @Test void none() { assertEquals(0, sol.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}})); }
}
