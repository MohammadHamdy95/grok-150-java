package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LinkedListCycleTest {
    private final LinkedListCycle sol = new LinkedListCycle();

    @Test void noCycle() { assertFalse(sol.hasCycle(ListNodes.of(1, 2, 3))); }
    @Test void empty() { assertFalse(sol.hasCycle(null)); }
    @Test void singleNoCycle() { assertFalse(sol.hasCycle(ListNodes.of(1))); }
    @Test void cycle() {
        ListNode head = ListNodes.of(3, 2, 0, -4);
        ListNode tail = head;
        while (tail.next != null) { tail = tail.next; }
        tail.next = head.next;
        assertTrue(sol.hasCycle(head));
    }
    @Test void selfLoop() {
        ListNode n = ListNodes.of(1);
        n.next = n;
        assertTrue(sol.hasCycle(n));
    }
}
