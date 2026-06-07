package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReverseLinkedListTest {
    private final ReverseLinkedList sol = new ReverseLinkedList();

    @Test void example() { assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNodes.toArray(sol.reverseList(ListNodes.of(1, 2, 3, 4, 5)))); }
    @Test void single() { assertArrayEquals(new int[]{1}, ListNodes.toArray(sol.reverseList(ListNodes.of(1)))); }
    @Test void two() { assertArrayEquals(new int[]{2, 1}, ListNodes.toArray(sol.reverseList(ListNodes.of(1, 2)))); }
    @Test void empty() { assertNull(sol.reverseList(null)); }
}
