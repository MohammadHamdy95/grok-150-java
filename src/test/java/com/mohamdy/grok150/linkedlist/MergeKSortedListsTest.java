package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MergeKSortedListsTest {
    private final MergeKSortedLists sol = new MergeKSortedLists();

    @Test void example() {
        ListNode[] lists = {ListNodes.of(1, 4, 5), ListNodes.of(1, 3, 4), ListNodes.of(2, 6)};
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, ListNodes.toArray(sol.mergeKLists(lists)));
    }
    @Test void empty() { assertNull(sol.mergeKLists(new ListNode[]{})); }
    @Test void allNullLists() { assertNull(sol.mergeKLists(new ListNode[]{null, null})); }
    @Test void single() { assertArrayEquals(new int[]{1, 2, 3}, ListNodes.toArray(sol.mergeKLists(new ListNode[]{ListNodes.of(1, 2, 3)}))); }
    @Test void mixedWithNulls() { assertArrayEquals(new int[]{0, 1, 2}, ListNodes.toArray(sol.mergeKLists(new ListNode[]{null, ListNodes.of(2), ListNodes.of(0, 1)}))); }
}
