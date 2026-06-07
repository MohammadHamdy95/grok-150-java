package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class CopyListWithRandomPointerTest {
    private final CopyListWithRandomPointer sol = new CopyListWithRandomPointer();

    @Test void empty() { assertNull(sol.copyRandomList(null)); }
    @Test void deepCopyValuesAndStructure() {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        a.next = b; b.next = c;
        a.random = null; b.random = a; c.random = b;
        Node copy = sol.copyRandomList(a);
        assertEquals(7, copy.val);
        assertEquals(13, copy.next.val);
        assertNotSame(a, copy);
        assertNotSame(b, copy.next);
        assertSame(copy, copy.next.random);          // b.random -> a
        assertSame(copy.next, copy.next.next.random); // c.random -> b
        assertNull(copy.random);
    }
}
