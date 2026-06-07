package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class PacificAtlanticWaterFlowTest {
    private final PacificAtlanticWaterFlow sol = new PacificAtlanticWaterFlow();

    @Test void example() {
        int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        assertEquals(
            canon(List.of(List.of(0, 4), List.of(1, 3), List.of(1, 4), List.of(2, 2),
                          List.of(3, 0), List.of(3, 1), List.of(4, 0))),
            canon(sol.pacificAtlantic(heights)));
    }
    @Test void singleCell() {
        assertEquals(canon(List.of(List.of(0, 0))), canon(sol.pacificAtlantic(new int[][]{{1}})));
    }
}
