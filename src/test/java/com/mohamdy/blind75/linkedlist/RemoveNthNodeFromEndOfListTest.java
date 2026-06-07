package com.mohamdy.blind75.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList sol = new RemoveNthNodeFromEndOfList();

    @Test void example() { assertArrayEquals(new int[]{1, 2, 3, 5}, ListNodes.toArray(sol.removeNthFromEnd(ListNodes.of(1, 2, 3, 4, 5), 2))); }
    @Test void removeOnly() { assertNull(sol.removeNthFromEnd(ListNodes.of(1), 1)); }
}
