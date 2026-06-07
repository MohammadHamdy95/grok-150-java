package com.mohamdy.grok150.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.*;
import static com.mohamdy.grok150.support.Cases.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Solution not implemented yet.")
class ReverseNodesInKGroupTest {
    private final ReverseNodesInKGroup sol = new ReverseNodesInKGroup();

    @Test void k2() { assertArrayEquals(new int[]{2, 1, 4, 3, 5}, ListNodes.toArray(sol.reverseKGroup(ListNodes.of(1, 2, 3, 4, 5), 2))); }
    @Test void k3() { assertArrayEquals(new int[]{3, 2, 1, 4, 5}, ListNodes.toArray(sol.reverseKGroup(ListNodes.of(1, 2, 3, 4, 5), 3))); }
    @Test void k1Unchanged() { assertArrayEquals(new int[]{1, 2, 3}, ListNodes.toArray(sol.reverseKGroup(ListNodes.of(1, 2, 3), 1))); }
    @Test void kEqualsLength() { assertArrayEquals(new int[]{4, 3, 2, 1}, ListNodes.toArray(sol.reverseKGroup(ListNodes.of(1, 2, 3, 4), 4))); }
    @Test void kBiggerThanLength() { assertArrayEquals(new int[]{1, 2, 3}, ListNodes.toArray(sol.reverseKGroup(ListNodes.of(1, 2, 3), 5))); }
}
