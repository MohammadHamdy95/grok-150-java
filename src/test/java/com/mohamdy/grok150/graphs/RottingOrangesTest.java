package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class RottingOrangesTest {
    private final RottingOranges sol = new RottingOranges();

    @Test void example() { assertEquals(4, sol.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}})); }
    @Test void impossible() { assertEquals(-1, sol.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}})); }
    @Test void noFresh() { assertEquals(0, sol.orangesRotting(new int[][]{{0, 2}})); }
    @Test void alreadyAllRotten() { assertEquals(0, sol.orangesRotting(new int[][]{{2, 2}, {2, 2}})); }
    @Test void emptyGridOfZeros() { assertEquals(0, sol.orangesRotting(new int[][]{{0, 0}, {0, 0}})); }
}
