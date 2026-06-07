package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class RedundantConnectionTest {
    RedundantConnection sol = new RedundantConnection();

    @Test void example() { assertArrayEquals(new int[]{2,3}, sol.findRedundantConnection(new int[][]{{1,2},{1,3},{2,3}})); }
}
