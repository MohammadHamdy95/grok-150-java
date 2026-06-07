package com.mohamdy.blind75.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CheapestFlightsWithinKStopsTest {
    CheapestFlightsWithinKStops sol = new CheapestFlightsWithinKStops();

    @Test void example() { assertEquals(700, sol.findCheapestPrice(4, new int[][]{{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}}, 0, 3, 1)); }
    @Test void example2() { assertEquals(200, sol.findCheapestPrice(3, new int[][]{{0,1,100},{1,2,100},{0,2,500}}, 0, 2, 1)); }
}
