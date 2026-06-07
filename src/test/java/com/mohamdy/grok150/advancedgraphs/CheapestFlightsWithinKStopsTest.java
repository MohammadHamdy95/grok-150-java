package com.mohamdy.grok150.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CheapestFlightsWithinKStopsTest {
    private final CheapestFlightsWithinKStops sol = new CheapestFlightsWithinKStops();

    @Test void example() { assertEquals(700, sol.findCheapestPrice(4, new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}}, 0, 3, 1)); }
    @Test void oneStop() { assertEquals(200, sol.findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1)); }
    @Test void zeroStops() { assertEquals(500, sol.findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0)); }
    @Test void unreachable() { assertEquals(-1, sol.findCheapestPrice(3, new int[][]{{0, 1, 100}}, 0, 2, 1)); }
}
