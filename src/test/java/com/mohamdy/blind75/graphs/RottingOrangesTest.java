package com.mohamdy.blind75.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class RottingOrangesTest {
    RottingOranges sol = new RottingOranges();

    @Test void example() { assertEquals(4, sol.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}})); }
    @Test void impossible() { assertEquals(-1, sol.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}})); }
}
