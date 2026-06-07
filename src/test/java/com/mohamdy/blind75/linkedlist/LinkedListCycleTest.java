package com.mohamdy.blind75.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class LinkedListCycleTest {
    LinkedListCycle sol = new LinkedListCycle();

    @Test void noCycle() { assertFalse(sol.hasCycle(ListNodes.of(1, 2, 3))); }
    @Test void empty() { assertFalse(sol.hasCycle(null)); }

    @Test void cycle() {
        ListNode head = ListNodes.of(3, 2, 0, -4);
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head.next; // create a cycle back to the second node
        assertTrue(sol.hasCycle(head));
    }
}
