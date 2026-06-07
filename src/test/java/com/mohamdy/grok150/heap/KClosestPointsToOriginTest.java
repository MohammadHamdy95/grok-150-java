package com.mohamdy.grok150.heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class KClosestPointsToOriginTest {
    private final KClosestPointsToOrigin sol = new KClosestPointsToOrigin();

    @Test void example() {
        assertArrayEquals(sortRows(new int[][]{{-2, 2}}), sortRows(sol.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1)));
    }
    @Test void two() {
        assertArrayEquals(sortRows(new int[][]{{3, 3}, {-2, 4}}),
                sortRows(sol.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2)));
    }
    @Test void all() {
        assertArrayEquals(sortRows(new int[][]{{1, 0}, {0, 1}}),
                sortRows(sol.kClosest(new int[][]{{1, 0}, {0, 1}}, 2)));
    }
    @Test void includesOrigin() {
        assertArrayEquals(sortRows(new int[][]{{0, 0}}), sortRows(sol.kClosest(new int[][]{{0, 0}, {5, 5}}, 1)));
    }
}
