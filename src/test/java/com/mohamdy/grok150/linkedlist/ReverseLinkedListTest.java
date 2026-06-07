package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReverseLinkedListTest {
    ReverseLinkedList sol = new ReverseLinkedList();

    @Test void example() { assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNodes.toArray(sol.reverseList(ListNodes.of(1, 2, 3, 4, 5)))); }
    @Test void empty() { assertNull(sol.reverseList(null)); }
}
