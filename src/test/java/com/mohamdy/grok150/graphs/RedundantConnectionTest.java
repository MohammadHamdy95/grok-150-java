package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class RedundantConnectionTest {
    private final RedundantConnection sol = new RedundantConnection();

    @Test void example() { assertArrayEquals(new int[]{2, 3}, sol.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}})); }
    @Test void example2() { assertArrayEquals(new int[]{1, 4}, sol.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}})); }
    @Test void triangleLast() { assertArrayEquals(new int[]{4, 1}, sol.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 1}})); }
}
