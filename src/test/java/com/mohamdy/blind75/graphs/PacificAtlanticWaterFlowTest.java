package com.mohamdy.blind75.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PacificAtlanticWaterFlowTest {
    PacificAtlanticWaterFlow sol = new PacificAtlanticWaterFlow();

    @Test void example() {
        int[][] heights = {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };
        // expected (order-independent): 7 cells
        assertEquals(7, sol.pacificAtlantic(heights).size());
    }
}
