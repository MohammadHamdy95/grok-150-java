package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReorderListTest {
    private final ReorderList sol = new ReorderList();

    @Test void even() { ListNode h = ListNodes.of(1, 2, 3, 4); sol.reorderList(h); assertArrayEquals(new int[]{1, 4, 2, 3}, ListNodes.toArray(h)); }
    @Test void odd() { ListNode h = ListNodes.of(1, 2, 3, 4, 5); sol.reorderList(h); assertArrayEquals(new int[]{1, 5, 2, 4, 3}, ListNodes.toArray(h)); }
    @Test void single() { ListNode h = ListNodes.of(1); sol.reorderList(h); assertArrayEquals(new int[]{1}, ListNodes.toArray(h)); }
    @Test void two() { ListNode h = ListNodes.of(1, 2); sol.reorderList(h); assertArrayEquals(new int[]{1, 2}, ListNodes.toArray(h)); }
}
