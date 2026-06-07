package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NumberOfIslandsTest {
    private final NumberOfIslands sol = new NumberOfIslands();

    @Test void example() {
        assertEquals(3, sol.numIslands(new char[][]{
            {'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}}));
    }
    @Test void oneBigIsland() { assertEquals(1, sol.numIslands(new char[][]{{'1', '1'}, {'1', '1'}})); }
    @Test void allWater() { assertEquals(0, sol.numIslands(new char[][]{{'0', '0'}, {'0', '0'}})); }
    @Test void diagonalNotConnected() { assertEquals(2, sol.numIslands(new char[][]{{'1', '0'}, {'0', '1'}})); }
    @Test void singleLand() { assertEquals(1, sol.numIslands(new char[][]{{'1'}})); }
}
