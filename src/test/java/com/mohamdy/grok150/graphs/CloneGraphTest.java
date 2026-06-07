package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CloneGraphTest {
    CloneGraph sol = new CloneGraph();

    @Test void single() {
        Node n = new Node(1);
        Node clone = sol.cloneGraph(n);
        assertEquals(1, clone.val);
        assertNotSame(n, clone);
    }

    @Test void empty() { assertNull(sol.cloneGraph(null)); }
}
