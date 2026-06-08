package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

//@Disabled("Solution not implemented yet.")
class RemoveNthNodeFromEndOfListTest {
    private final RemoveNthNodeFromEndOfList sol = new RemoveNthNodeFromEndOfList();

    @Test void middle() { assertArrayEquals(new int[]{1, 2, 3, 5}, ListNodes.toArray(sol.removeNthFromEnd(ListNodes.of(1, 2, 3, 4, 5), 2))); }
    @Test void removeOnly() { assertNull(sol.removeNthFromEnd(ListNodes.of(1), 1)); }
    @Test void removeHead() { assertArrayEquals(new int[]{2, 3}, ListNodes.toArray(sol.removeNthFromEnd(ListNodes.of(1, 2, 3), 3))); }
    @Test void removeTail() { assertArrayEquals(new int[]{1, 2}, ListNodes.toArray(sol.removeNthFromEnd(ListNodes.of(1, 2, 3), 1))); }
}
