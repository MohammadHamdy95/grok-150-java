package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CopyListWithRandomPointerTest {
    CopyListWithRandomPointer sol = new CopyListWithRandomPointer();

    @Test void single() {
        Node n = new Node(7);
        Node copy = sol.copyRandomList(n);
        assertEquals(7, copy.val);
        assertNotSame(n, copy);
    }

    @Test void empty() { assertNull(sol.copyRandomList(null)); }
}
