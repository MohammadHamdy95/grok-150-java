package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CourseScheduleIITest {
    private final CourseScheduleII sol = new CourseScheduleII();

    private boolean validOrder(int n, int[][] pre, int[] order) {
        if (order.length != n) { return false; }
        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < order.length; i++) { pos.put(order[i], i); }
        if (pos.size() != n) { return false; }
        for (int[] p : pre) { if (pos.get(p[1]) > pos.get(p[0])) { return false; } }
        return true;
    }

    @Test void simple() { assertArrayEquals(new int[]{0, 1}, sol.findOrder(2, new int[][]{{1, 0}})); }
    @Test void cycleReturnsEmpty() { assertArrayEquals(new int[]{}, sol.findOrder(2, new int[][]{{1, 0}, {0, 1}})); }
    @Test void noPrereqs() { assertEquals(3, sol.findOrder(3, new int[][]{}).length); }
    @Test void validTopologicalOrder() {
        int[][] pre = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        assertTrue(validOrder(4, pre, sol.findOrder(4, pre)));
    }
}
