package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NumberOfIslandsTest {
    NumberOfIslands sol = new NumberOfIslands();

    @Test void example() {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, sol.numIslands(grid));
    }

    @Test void single() {
        assertEquals(1, sol.numIslands(new char[][]{{'1', '1'}, {'1', '1'}}));
    }
}
