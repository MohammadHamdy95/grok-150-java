package com.mohamdy.blind75.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MergeKSortedListsTest {
    MergeKSortedLists sol = new MergeKSortedLists();

    @Test void example() {
        ListNode[] lists = {ListNodes.of(1, 4, 5), ListNodes.of(1, 3, 4), ListNodes.of(2, 6)};
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, ListNodes.toArray(sol.mergeKLists(lists)));
    }

    @Test void empty() { assertNull(sol.mergeKLists(new ListNode[]{})); }
}
