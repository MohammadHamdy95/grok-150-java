package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MaxAreaOfIslandTest {
    private final MaxAreaOfIsland sol = new MaxAreaOfIsland();

    @Test void example() {
        assertEquals(6, sol.maxAreaOfIsland(new int[][]{
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}}));
    }
    @Test void none() { assertEquals(0, sol.maxAreaOfIsland(new int[][]{{0, 0}, {0, 0}})); }
    @Test void full() { assertEquals(4, sol.maxAreaOfIsland(new int[][]{{1, 1}, {1, 1}})); }
    @Test void separateIslands() { assertEquals(1, sol.maxAreaOfIsland(new int[][]{{1, 0}, {0, 1}})); }
}
