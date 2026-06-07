package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class WallsAndGatesTest {
    private final WallsAndGates sol = new WallsAndGates();

    @Test void example() {
        int INF = Integer.MAX_VALUE;
        int[][] rooms = {{INF, -1, 0, INF}, {INF, INF, INF, -1}, {INF, -1, INF, -1}, {0, -1, INF, INF}};
        sol.wallsAndGates(rooms);
        assertArrayEquals(new int[][]{{3, -1, 0, 1}, {2, 2, 1, -1}, {1, -1, 2, -1}, {0, -1, 3, 4}}, rooms);
    }
    @Test void unreachableStaysInf() {
        int INF = Integer.MAX_VALUE;
        int[][] rooms = {{INF, -1}, {-1, INF}};
        sol.wallsAndGates(rooms);
        assertArrayEquals(new int[][]{{INF, -1}, {-1, INF}}, rooms);
    }
    @Test void onlyGate() {
        int[][] rooms = {{0}};
        sol.wallsAndGates(rooms);
        assertArrayEquals(new int[][]{{0}}, rooms);
    }
}
