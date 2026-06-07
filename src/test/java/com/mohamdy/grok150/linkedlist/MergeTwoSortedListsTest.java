package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists sol = new MergeTwoSortedLists();

    @Test void example() { assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, ListNodes.toArray(sol.mergeTwoLists(ListNodes.of(1, 2, 4), ListNodes.of(1, 3, 4)))); }
    @Test void bothEmpty() { assertNull(sol.mergeTwoLists(null, null)); }
    @Test void oneEmpty() { assertArrayEquals(new int[]{1, 2}, ListNodes.toArray(sol.mergeTwoLists(null, ListNodes.of(1, 2)))); }
    @Test void disjoint() { assertArrayEquals(new int[]{1, 2, 3, 4}, ListNodes.toArray(sol.mergeTwoLists(ListNodes.of(1, 2), ListNodes.of(3, 4)))); }
    @Test void interleaved() { assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, ListNodes.toArray(sol.mergeTwoLists(ListNodes.of(1, 3, 5), ListNodes.of(2, 4, 6)))); }
}
