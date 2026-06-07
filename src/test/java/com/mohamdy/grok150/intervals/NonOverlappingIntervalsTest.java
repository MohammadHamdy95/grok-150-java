package com.mohamdy.grok150.intervals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NonOverlappingIntervalsTest {
    private final NonOverlappingIntervals sol = new NonOverlappingIntervals();

    @Test void example() { assertEquals(1, sol.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}})); }
    @Test void none() { assertEquals(0, sol.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}})); }
    @Test void allSame() { assertEquals(2, sol.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}})); }
    @Test void single() { assertEquals(0, sol.eraseOverlapIntervals(new int[][]{{1, 2}})); }
    @Test void nested() { assertEquals(2, sol.eraseOverlapIntervals(new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}})); }
}
