package com.mohamdy.grok150.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CloneGraphTest {
    private final CloneGraph sol = new CloneGraph();

    @Test void empty() { assertNull(sol.cloneGraph(null)); }
    @Test void single() {
        Node n = new Node(1);
        Node c = sol.cloneGraph(n);
        assertEquals(1, c.val);
        assertNotSame(n, c);
        assertTrue(c.neighbors.isEmpty());
    }
    @Test void deepCopiesNeighbors() {
        Node a = new Node(1);
        Node b = new Node(2);
        a.neighbors.add(b);
        b.neighbors.add(a);
        Node ca = sol.cloneGraph(a);
        assertEquals(1, ca.val);
        assertNotSame(a, ca);
        assertEquals(1, ca.neighbors.size());
        Node cb = ca.neighbors.get(0);
        assertEquals(2, cb.val);
        assertNotSame(b, cb);
        assertSame(ca, cb.neighbors.get(0)); // cycle preserved
    }
}
