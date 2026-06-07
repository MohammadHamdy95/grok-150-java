package com.mohamdy.grok150.advancedgraphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class NetworkDelayTimeTest {
    private final NetworkDelayTime sol = new NetworkDelayTime();

    @Test void example() { assertEquals(2, sol.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2)); }
    @Test void twoNodes() { assertEquals(1, sol.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 1)); }
    @Test void unreachable() { assertEquals(-1, sol.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 2)); }
    @Test void singleNode() { assertEquals(0, sol.networkDelayTime(new int[][]{}, 1, 1)); }
}
