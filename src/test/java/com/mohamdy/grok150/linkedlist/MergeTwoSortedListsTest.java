package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MergeTwoSortedListsTest {
    MergeTwoSortedLists sol = new MergeTwoSortedLists();

    @Test void example() { assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, ListNodes.toArray(sol.mergeTwoLists(ListNodes.of(1, 2, 4), ListNodes.of(1, 3, 4)))); }
    @Test void bothEmpty() { assertNull(sol.mergeTwoLists(null, null)); }
}
